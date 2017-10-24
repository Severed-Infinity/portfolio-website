(ns portfolio-website.about-page
  (:require [hiccup
             [core :as hic]
             [util :refer [to-uri]]]
            [portfolio-website.pages-core :as pages]))

(def tag-line
  (hic/html
    [:aside.col-xs-12.col.md-5
     [:h1 "The up-and-comer"]

     ;;TODO only temporary list
     #_[:ol
        [:li "What am I?"]
        [:li "What do I do?"]
        [:li "Where am I from? (county/city)"]
        [:li "Freelancer, working, looking for work?"]]

     [:p "\"Highly intuitive, adept at programming with
     experience in web development based in Dublin; "
      [:br]
      "Seeking to expand and develop new skills while
      looking for challenging and unique opportunities.\""]

     #_[:p "A programmer and web designer plucked right
     from the hands of god." [:br]
        "who loves to build websites and challenge my
        coding skills." [:br]
        "living in dublin"
        [:br]
        "looking to develop something different and
        unique"]]))

(def about-page
  (pages/page
    "About - David Swift"
    (hic/html
      tag-line
      ;TODO better image of self
      [:section.col-xs-12.col-md-5.col-md-push-7
       [:img.img-responsive.thumbnail {:alt "profile image of me"
                                       :src (to-uri "david_swift.jpg")}]]
      [:section.col-xs-12.col-md-6.col-md-pull-5
       [:h1 "About Me"]
       [:p " Welcome to the world of David Swift, don’t be afraid to stay awhile, as long as you are here I should introduce myself. Well, I’m a computing student at "
        [:abbr {:title "Institute of Technology Tallaght"} "ITT"]
        ", a fourth to be exact, I’m half way through my final year as of writing this and I’ve learnt quite a bit since entering through the doors of the college."]
       [:p "My main focus has always been programming, I knew that it was what I’ve wanted to do since finishing my leaving cert, and majority of my experience in
       programming has been focused on working with JAVA along with this I’ve had a fair years working with html and other web related technologies."]
       [:p "Most of my knowledge had not come from college work it came from working outside of my comfort zone, researching and reaching out for help, it was no
       easy task at that but in doing so have come along way and will continue to strive to progress further down these roads."]
       [:p "I’m known from within my class and some social circles as being very helpful and knowledgable when it comes to figuring out coding problems among other
       things, giving a helping hand where I can. Always took the leadership role and guided my teams through various projects since my first year and it was never
       an easy task, many walls stood in the way but ultimately found away over."]])))

