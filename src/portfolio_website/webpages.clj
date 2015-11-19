(ns portfolio-website.webpages
  (:require [hiccup
             [core :as hic]
             [util :refer [to-uri]]
             [page :as page]]))

(defn comment-wrapper
  "Wrap the supplied HTML in a comment"
  [html]
  (str "<!--" html "-->"))

(def nav
  (hic/html
    [:nav.navbar.navbar-default.navbar-fixed-top {:role "navigation"}
     [:div.container
      [:div.navbar-header
       [:button.navbar-toggle.collapsed
        {:type          "button"
         :data-toggle   "collapse"
         :data-target   ".navbar-collapse"
         :aria-expanded "false"
         :aria-control  "navbar"}
        [:span.sr-only "Toggle navigation"]
        [:span.icon-bar]
        [:span.icon-bar]
        [:span.icon-bar]]
       [:a.navbar-brand {:href "/"} "David Swift"]]
      [:div.navbar-collapse.collapse
       [:div.nav.navbar-nav
        [:a.social.entypo-twitter {:href "https://twitter.com/SeveredInfinity" :target "_blank"}
         [:img.visible-xs.visbible.sm {:alt "twitter logo" :src (to-uri "svg/twitter21.svg")}] #_"&#62217;"]
        [:a.social.entypo-linkedin {:href "https://ie.linkedin.com/in/severedinfinity" :target "_blank"}
         [:img.visible-xs.visbible.sm {:alt "linkedin logo" :src (to-uri "svg/linkedin11.svg")}] #_"&#62232;"]
        [:a.social.entypo-github {:href "https://github.com/Severed-Infinity" :target "_blank"}
         [:img.visible-xs.visbible.sm {:alt "github logo" :src (to-uri "svg/github13.svg")}] #_"&#62208;"]]
       [:ul.nav.navbar-nav.navbar-right
        [:li [:a {:href "#"} "Projects"]]
        [:li [:a {:href "#"} "Education"]]
        #_[:li [:a {:href "#"} "Reviews/Comments"]]
        [:li [:a {:href   (to-uri "davidswift_cv.pdf")
                  :target "_blank"
                  :rel    "nofollow"} "CV"]]]]]]))

(defn page [title & more]
  (page/html5
    {:lang "en"}
    (hic/html
      [:head
       [:meta {:charset "utf-8"}]
       [:meta {:http-equiv "X-UA-Compatible" :content "IE=edge"}]
       [:meta {:name    "viewport"
               :content "width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"}]
       (page/include-css
         "css.css"
         "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css")
       #_(page/include-css "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css")
       [:title title]
       (comment-wrapper
         (hic/html
           [:script {:src "https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"}]
           [:script {:src "https://oss.maxcdn.com/respond/1.4.2/respond.min.js"}]))]
      [:body
       nav
       [:div.breaker]
       [:main.container
        more]
       [:div
        [:hr]
        "Icons made by "
        [:a {:href "http://www.flaticon.com/authors/simpleicon" :title "SimpleIcon"} "SimpleIcon"] " from "
        [:a {:href "http://www.flaticon.com" :title "Flaticon"} "www.flaticon.com"] "is licensed by "
        [:a {:href "http://creativecommons.org/licenses/by/3.0/" :title "Creative Commons BY 3.0"} " CC BY 3.0"]]
       (page/include-js
         "https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"
         "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js")])))

(def about-page
  (page
    "About - David Swift"
    (hic/html
      ;tag-line
      [:section
       [:h1 "About Me"]
       [:p " Welcome to the world of David Swift, don’t be afraid to stay awhile, as long as you are here I should introduce myself. Well, I’m a computing student at"
        [:abbr {:title "Institute of Technology Tallaght"} "ITT"]
        ", a fourth to be exact, I’m half way through my final year as of writing this and I’ve learnt quite a bit since entering through the doors of the college."]
       ]
      [:img {:alt "profile image of me"
             :src "#"}])))