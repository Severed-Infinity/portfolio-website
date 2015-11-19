(ns portfolio-website.webpages
  (:require [hiccup
             [core :as hic]
             [util :refer [to-uri]]
             [page :as page]]))

(def nav
  (hic/html
    [:nav
     [:a {:href "/"} "David Swift"]
     " | "
     [:a {:href "#"} "Projects"]
     " | "
     [:a {:href "#"} "Education"]
     " | "
     [:a {:href "#"} "Reviews/Comments"]
     " | "
     [:a {:href   (to-uri "davidswift_cv.pdf")
          :target "_blank"
          :rel    "nofollow"} "downlaod"]
     [:button {:type "button"} "CV"]]))

(defn page [& more]
  (hic/html
    [:head (page/include-css "css.css")]
    nav
    more))

(def about-page
  (page
    #_(hic/html
        ;tag-line
        [:section
         [:h1 "About Me"]
         [:p "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras ornare sagittis magna et bibendum. Nullam luctus vitae massa at elementum. Suspendisse ipsum nisi, tempus sit amet arcu et, semper scelerisque neque. Morbi posuere luctus eros eu convallis. Vivamus auctor massa mi, sit amet mollis felis maximus ac. In maximus ex leo, at dictum augue lobortis sed. Etiam sit amet velit lacus. Maecenas leo nisl, vulputate quis bibendum in, iaculis a velit. Donec feugiat cursus libero hendrerit dapibus. Donec imperdiet lectus sem, vel dapibus odio ultricies vel. In condimentum urna enim, vitae viverra metus facilisis vel. Vestibulum justo ante, accumsan ut nulla vehicula, sodales elementum nulla. Nulla in velit non lorem tempus imperdiet id in sem. Integer sit amet dui odio. Praesent hendrerit blandit vulputate."]
         [:p "Nunc consectetur efficitur imperdiet. Integer felis lacus, facilisis sed varius facilisis, lobortis non enim. Donec accumsan est id dictum volutpat. Sed vel magna ultricies, maximus nisi vitae, consectetur enim. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Nulla vel mattis enim, non mollis tellus. Suspendisse vitae ultrices nulla, et lobortis nunc. Etiam sit amet lacus ac purus gravida pellentesque vitae id risus. Sed ornare est ut lectus dictum blandit. Pellentesque sed nisi enim. Nam in dapibus dui. Aenean ullamcorper varius neque, eu hendrerit nulla faucibus eu. Quisque ac tellus accumsan, tempus ligula ac, sodales quam. Phasellus eget erat sed nunc gravida mollis a eget mi. Suspendisse maximus lacinia fermentum. Morbi sit amet consectetur nibh, id sodales magna."
          ]]
        [:img {:alt "profile image of me"
               :src 'images/IMG_2247.jpg}])))