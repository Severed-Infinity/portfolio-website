(ns portfolio-website.projects-page
  (:require [portfolio-website.pages-core :as pages]))

(def projects
  (pages/page
    "Projects - David Swift"
    [:ul.nav.nav-tabs
     [:li.active [:a {:data-toggle "tab" :href "#fourth"} "Fourth Year"]]
     [:li [:a {:data-toggle "tab" :href "#third"} "Third Year"]]
     [:li [:a {:data-toggle "tab" :href "#second"} "Second Year"]]
     [:li [:a {:data-toggle "tab" :href "#proj4"} "proj4"]]]
    [:div.tab-content
     [:div#fourth.tab-pane.fade.in.active
      [:h3 "proj1"]
      [:p "some text"]]
     [:div#third.tab-pane.fade
      [:h3 "proj2"]
      [:p "some text"]]
     [:div#second.tab-pane.fade
      [:h3 "proj3"]
      [:p "some text"]]
     [:div#proj4.tab-pane.fade
      [:h3 "proj4"]
      [:p "some text"]]]))