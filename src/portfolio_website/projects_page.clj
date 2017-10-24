(ns portfolio-website.projects-page
  (:require [portfolio-website.pages-core :as pages]))

(def projects
  (pages/page
    "Projects - David Swift"
    [:ul.nav.nav-tabs
     [:li.active [:a {:data-toggle "tab" :href "#fourth"} "Fourth Year"]]
     [:li [:a {:data-toggle "tab" :href "#third"} "Third Year"]]
     [:li [:a {:data-toggle "tab" :href "#second"} "Second Year"]]
     #_[:li [:a {:data-toggle "tab" :href "#proj4"} "proj4"]]]

    [:div.tab-content
     [:div#fourth.tab-pane.fade.in.active
      [:h3 "SMS Application"]
      [:h4 "Technologies"]
      [:ul
       [:li "Language: Clojure(Script)"]
       [:li "Platforms: iOS, Android, Web"]
       [:li "Complier: RoboVM"]
       [:li "Front-end: ClojureScript (Web), Clojure (Native complied->iOS, Android)"]]
      [:aside.label.label-danger "This is my current fourth project, it is a work in progress as of writing this."]
      [:h4 "Details/Description"]
      [:p "My fourth and final year project, for this project I wanted to be a bit more
      adventurous in my choice of topic. When initially looking for a post college job
      I focus on jobs that deal with "
       [:span.lead "Clojure "]
       "and found a company that had dealth with clojure and looked into what they did."]
      [:p "The company focused on SMS messaging systems from security to creation, and thus
       the idea to create an SMS application was born, a bit of a silly reason for choosing
        the topic but none the less I feel it was a good choice."]
      [:p "My SMS application though I wanted to be cross-platform, by that I mean not just
       mobile based on iOS and Android but to include desktop users through the use of a
        web application. On top of this I wanted to include some interesting or neat features
        that I personally would love to see built into 'oh say apples messaging app', thus
        features happen to be the following."]
      [:ol
       [:li "Standard SMS capabilities, important for those lacking internet connection"]
       [:li "Use Web Texts, that being carrier web texts from the likes of o2, metoer, vodafone or 3g's web texts."]
       [:li "Built in chat messager, so that those with the application can communicate in real time."]
       [:li "That the app not be blocking factor in commmunication, don't require the app to still keep in touch."]]]
     [:div#third.tab-pane.fade
      [:h3 "Review Website"]
      [:h4 "Technologies"]
      [:ul
       [:li "Language: Javascript, MEAN-Stack"]
       [:li "Web"]
       [:li "Front-end: AngularJS"]
       [:li "Database: Mongodb"]
       [:li "Router: ExpressJS"]
       [:li "Back-end; NodeJS"]]
      [:h4 "Details/Description"]
      [:p "This project was a review website that wanted to put the power in the hands of the
      users, it is always the editors and writers of a website/company (the employee's if you will)
      that control the content available on these sites with users on able to comment and rate.
      In otherwords the review can be very biased for a number of different reasons."]
      [:p "With that in mind it gives users a better chance of writing truer reflects of the
      games, of I forgot to mention the site is a games review website, they play. It also means
      there is a chance for something unknown or gone under the radar to make an appearance,
      give it a chance to see more users try it out."]
      [:p "On the site users could create new review articles, write response reviews to the main article
       and even reply to one another, as for removing users or content an admin was required, initiall this
       was not consider but the project superivsors were very adament about having admin features included."]]
     [:div#second.tab-pane.fade
      [:h3 "Timetable System"]
      [:h4 "Technologies"]
      [:ul
       [:li "Language: JAVA"]
       [:li "Platform: Windows Desktop"]
       [:li "Front-end; JavaFX"]
       [:li "Database: Orcale Express 11g"]]
      [:h4 "Details/Description"]
      [:p "My second year project, I had a simple goal in mind and that was to improve/fix my
      colleges timetable system. The system is terrible and still remains unchanged to this day
       with many issues such as big classes being assigned to small rooms and vice veras. Times
       being awkward, large chunks of the same class in a row or large chunks of breaks in a row
       and so on."]
      [:p "I took some time to map each in the college, what department they belonged to, the
      number of seats in each room, whether they were lecturer halls or labs. I had wanted access
      to the sizes of classes but couldn't get it."]
      [:p "The design was simple start by mapping big classes to big rooms and small classes to
       small rooms, from there it was a case of assigning the classes to approiate labs based on
       number of modules that required a lab. And lastly was to make sure that there was no more
       than 2 hours of the same module in a row or more than an hour break in a row."]
      [:p "Ultimately the task was to big of an undertaken and ended being a department, course and
      module creation system with features to add staff and student details."]]

     #_[:div#proj4.tab-pane.fade
        [:h3 "proj4"]
        [:p "some text"]]]))