(ns portfolio-website.projects-page
  (:require [portfolio-website.pages-core :as pages]))

(def projects
  (pages/page
    "Projects - David Swift"
    [:ul.nav.nav-tabs
     [:li.active [:a {:data-toggle "tab" :href "#fourth"} "Fourth Year"]]
     [:li [:a {:data-toggle "tab" :href "#third"} "Third Year"]]
     [:li [:a {:data-toggle "tab" :href "#second"} "Second Year"]]
     #_[:li [:a {:data-toggle "tab" :href "#proj4"} "proj4"]]
     ]
    [:div.tab-content
     [:div#fourth.tab-pane.fade.in.active
      [:h3 "SMS Application"]
      [:h4 "Technologies"]
      [:ul
       [:li "Language: Clojure(Script)"]
       [:li "Platforms: iOS, Android, Web"]
       [:li "Complier: RoboVM"]
       [:li "Front-end: ClojureScript (Web), Clojure (Native complied->iOS, Android)"]]
      [:h4 "Details/Description"]
      [:p "some text"]]
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
      [:p "some text"]]
     [:div#second.tab-pane.fade
      [:h3 "Timetable System"]
      [:h4 "Technologies"]
      [:ul
       [:li "Language: JAVA"]
       [:li "Platform: Windows Desktop"]
       [:li "Front-end; JavaFX"]
       [:li "Database: Orcale Express 11g"]]
      [:h4 "Details/Description"]
      [:p "some text"]]

     #_[:div#proj4.tab-pane.fade
      [:h3 "proj4"]
      [:p "some text"]]]))