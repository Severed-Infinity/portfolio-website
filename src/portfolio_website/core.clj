(ns portfolio-website.core
  (:require [compojure.core :refer [defroutes GET PUT POST DELETE ANY]]
            [compojure.handler :refer [site]]
            [compojure.route :as route]
            [clojure.java.io :as io]
            [ring.middleware.stacktrace :as trace]
            [ring.middleware.session :as session]
            [ring.middleware.session.cookie :as cookie]
            [ring.adapter.jetty :as jetty]
            [ring.middleware.basic-authentication :as basic]
            [cemerick.drawbridge :as drawbridge]
            [environ.core :refer [env]]
            [portfolio-website.about-page :as about]
            [portfolio-website.projects-page :as projects]
            [portfolio-website.education-page :as education]
            [postal.core :as postal]))

(defn- authenticated? [user pass]
  ;; TODO: heroku config:add REPL_USER=[...] REPL_PASSWORD=[...]
  (= [user pass] [(env :repl-user false) (env :repl-password false)]))

(def ^:private drawbridge
  (-> (drawbridge/ring-handler)
    (session/wrap-session)
    (basic/wrap-basic-authentication authenticated?)))

(defn send-message [from phone subject message]
  (do (println from phone subject message)
      (postal/send-message
        #_{:host "smtp-mail.outlook.com"
           :user "masterdavidswift@hotmail.com"
           :pass "Tuva4~FejaLere"
           :port 587}
        {:from    from
         :to      "masterdavidswift@hotmail.com"
         :subject subject
         :body    message
         :X-tra   phone})))

(defroutes app
  (ANY "/repl" {:as req}
    (drawbridge req))
  (GET "/" [] about/about-page)
  (GET "/projects" [] projects/projects)
  (GET "/education" [] education/education-page)
  (POST "/" [from phone subject message] (send-message from phone subject message))
  (route/resources "/"))

(defn wrap-error-page [handler]
  (fn [req]
    (try (handler req)
         (catch Exception e
           {:status  500
            :headers {"Content-Type" "text/html"}
            :body    (slurp (io/resource "500.html"))}))))

(defn wrap-app [app]
  ;; TODO: heroku config:add SESSION_SECRET=$RANDOM_16_CHARS
  (let [store (cookie/cookie-store {:key (env :session-secret)})]
    (-> app
      ((if (env :production)
         wrap-error-page
         trace/wrap-stacktrace))
      (site {:session {:store store}}))))

(defn -main [& [port]]
  (let [port (Integer. (or port (env :port) 5000))]
    (jetty/run-jetty (wrap-app #'app) {:port port :join? false})))

;; For interactive development:
;; (.stop server)
;; (def server (-main))
