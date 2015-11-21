(ns portfolio-website.education-page
  (:require [hiccup.core :as hic]
            [portfolio-website.pages-core :as pages]))

(def education-page
  (pages/page
    "Education - David Swift"
    (hic/html
      [:section
       [:h1 "Education and Results"]
       [:h2 "IT-Tallaght"]
       [:div.row
        [:div#accordian.panel-group.col.xs-12.col-md-6
         [:div.panel.panel-default
          [:div.panel-heading
           [:h4
            [:a {:data-toggle "collapse" :data-parent "#accordian" :href "#fourthyear"} "Fourth Year"]]]
          [:div#fourthyear.panel-collapse.collapse
           [:div.panel-body "stuff"]]]
         [:div.panel.panel-default
          [:div.panel-heading
           [:h4 [:a {:data-toggle "collapse" :data-parent "#accordian" :href "#thirdyear"} "Third Year"]]]
          [:div#thirdyear.panel-collapse.collapse
           [:div.panel-body "stuff"]]]
         [:div.panel.panel-default
          [:div.panel-heading
           [:h4 [:a {:data-toggle "collapse" :data-parent "#accordian" :href "#secondyear"} "Second Year"]]]
          [:div#secondyear.panel-collapse.collapse
           [:div.panel-body "stuff"]]]
         [:div.panel.panel-default
          [:div.panel-heading
           [:h4 [:a {:data-toggle "collapse" :data-parent "#accordian" :href "#firstyear"} "First Year"]]]
          [:div#firstyear.panel-collapse.collapse
           [:div.panel-body "stuff"]]]]]
       [:h2 "Pearse College of further education"]
       [:div.row
        [:div#accordian2.panel-group.col.xs-12.col-md-6
         [:div.panel.panel-default
          [:div.panel-heading
           [:h4
            [:a {:data-toggle "collapse" :data-parent "#accordian2" :href "#fetaclvl6"} "Fetac Level 6"]]]
          [:div#fetaclvl6.panel-collapse.collapse
           [:div.panel-body "stuff"]]]
         [:div.panel.panel-default
          [:div.panel-heading
           [:h4
            [:a {:data-toggle "collapse" :data-parent "#accordian2" :href "#fetaclvl5"} "Fetac Level 5"]]]
          [:div#fetaclvl5.panel-collapse.collapse
           [:div.panel-body "stuff"]]]
         [:div.panel.panel-default
          [:div.panel-heading
           [:h4
            [:a {:data-toggle "collapse" :data-parent "#accordian2" :href "#repeatyear"} "Repeat Leaving Cert"]]]
          [:div#repeatyear.panel-collapse.collapse
           [:div.panel-body "stuff"]]]]]]
      [:aside.row.container
       [:h1 "Merits and Awards"]
       [:ul.list-group.col-xs-12.col-md-6
        [:li.list-group-item "Zero Days missed - Secondary School"]
        [:li.list-group-item "Trinity Access Program (TAP)"]]])))