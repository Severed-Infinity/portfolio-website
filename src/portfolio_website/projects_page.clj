(ns portfolio-website.projects-page
  (:require [portfolio-website.pages-core :as pages]))

(def projects
  (pages/page
    "Projects - David Swift"
    [:ul.nav.nav-tabs
     [:li.active [:a {:data-toggle "tab" :href "#proj1"} "proj1"]]
     [:li [:a {:data-toggle "tab" :href "#proj2"} "proj2"]]
     [:li [:a {:data-toggle "tab" :href "#proj3"} "proj3"]]
     [:li [:a {:data-toggle "tab" :href "#proj4"} "proj4"]]]
    [:div.tab-content
     [:div#proj1.tab-pane.fade.in.active
      [:h3 "proj1"]
      [:p "some text"]]
     [:div#proj2.tab-pane.fade
      [:h3 "proj2"]
      [:p "some text"]]
     [:div#proj3.tab-pane.fade
      [:h3 "proj3"]
      [:p "some text"]]
     [:div#proj4.tab-pane.fade
      [:h3 "proj4"]
      [:p "some text"]]]))