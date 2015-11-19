(ns portfolio-website.webpages
  (:require [hiccup
             [core :as hic]
             [util :refer [to-uri]]
             [page :as page]]))

(defn comment
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
       [:ul.nav.navbar-nav
        [:li [:a {:href "https://twitter.com/SeveredInfinity"} "Twitter"]]
        [:li [:a {:href "https://ie.linkedin.com/in/severedinfinity"} "LinkedIn"]]
        [:li [:a {:href "https://github.com/Severed-Infinity"} "GitHub"]]]
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
       (comment
         (hic/html
           [:script {:src "https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"}]
           [:script {:src "https://oss.maxcdn.com/respond/1.4.2/respond.min.js"}]))]
      [:body
       nav
       more
       (page/include-js
         "https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"
         "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js")])))

(def about-page
  (page
    "About - David Swift"
    #_(hic/html
        ;tag-line
        [:section
         [:h1 "About Me"]
         [:p "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras ornare sagittis magna et bibendum. Nullam luctus vitae massa at elementum. Suspendisse ipsum nisi, tempus sit amet arcu et, semper scelerisque neque. Morbi posuere luctus eros eu convallis. Vivamus auctor massa mi, sit amet mollis felis maximus ac. In maximus ex leo, at dictum augue lobortis sed. Etiam sit amet velit lacus. Maecenas leo nisl, vulputate quis bibendum in, iaculis a velit. Donec feugiat cursus libero hendrerit dapibus. Donec imperdiet lectus sem, vel dapibus odio ultricies vel. In condimentum urna enim, vitae viverra metus facilisis vel. Vestibulum justo ante, accumsan ut nulla vehicula, sodales elementum nulla. Nulla in velit non lorem tempus imperdiet id in sem. Integer sit amet dui odio. Praesent hendrerit blandit vulputate."]
         [:p "Nunc consectetur efficitur imperdiet. Integer felis lacus, facilisis sed varius facilisis, lobortis non enim. Donec accumsan est id dictum volutpat. Sed vel magna ultricies, maximus nisi vitae, consectetur enim. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Nulla vel mattis enim, non mollis tellus. Suspendisse vitae ultrices nulla, et lobortis nunc. Etiam sit amet lacus ac purus gravida pellentesque vitae id risus. Sed ornare est ut lectus dictum blandit. Pellentesque sed nisi enim. Nam in dapibus dui. Aenean ullamcorper varius neque, eu hendrerit nulla faucibus eu. Quisque ac tellus accumsan, tempus ligula ac, sodales quam. Phasellus eget erat sed nunc gravida mollis a eget mi. Suspendisse maximus lacinia fermentum. Morbi sit amet consectetur nibh, id sodales magna."
          ]]
        [:img {:alt "profile image of me"
               :src 'images/IMG_2247.jpg}])))