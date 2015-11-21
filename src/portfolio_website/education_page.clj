(ns portfolio-website.education-page
  (:require [hiccup.core :as hic]
            [portfolio-website.pages-core :as pages])
  (:import [java.security Security]))

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
            [:a {:data-toggle "collapse" :data-parent "#accordian" :href "#fourthyear"} "Fourth Year: 2015 - 2016 | GPA -"]]]
          [:div#fourthyear.panel-collapse.collapse
           [:div.panel-body "As this is my final year all grades and GPA have yet to be rewarded."]]]
         [:div.panel.panel-default
          [:div.panel-heading
           [:h4 [:a {:data-toggle "collapse" :data-parent "#accordian" :href "#thirdyear"} "Third Year: 2014 - 2015 | GPA: 3.04"]]]
          [:div#thirdyear.panel-collapse.collapse
           [:div.panel-body
            [:ul.list-group
             [:li.list-group-item "Network Management B+"]
             [:li.list-group-item "Project C"]
             [:li.list-group-item "Object Orient Analysis & Design 2 A"]
             [:li.list-group-item "Alorgithms and Data Structures 2 B+"]
             [:li.list-group-item "Logic and Problem Solving B"]
             [:li.list-group-item "Advanced Databases B+"]
             [:li.list-group-item "Cloud Services and Distributed Computing C"]
             [:li.list-group-item "Innovation & Entrepreneurship B-"]
             [:li.list-group-item "Operating Systems B"]
             [:li.list-group-item "Web Design & Development 2 B-"]
             [:li.list-group-item "Algorithms and Data Structures 1 B"]]]]]

         [:div.panel.panel-default
          [:div.panel-heading
           [:h4 [:a {:data-toggle "collapse" :data-parent "#accordian" :href "#secondyear"} "Second Year: 2013 - 2014 | GPA: 3.33"]]]
          [:div#secondyear.panel-collapse.collapse
           [:div.panel-body
            [:ul.list-group
             [:li.list-group-item "Project B+"]
             [:li.list-group-item "Information Security C"]
             [:li.list-group-item "Object Oriented Analysis & Design C+"]
             [:li.list-group-item "Management Science A"]
             [:li.list-group-item "Networking 2"]
             [:li.list-group-item "Software Development 4 B+"]
             [:li.list-group-item "Web Design & Development B"]
             [:li.list-group-item "Discrete Mathemathics 2 A"]
             [:li.list-group-item "Database Design & Programming B+"]
             [:li.list-group-item "Networking 1 B"]
             [:li.list-group-item "Software Quality Assurance & Testing B"]
             [:li.list-group-item "Software Development 3 A"]]]]]

         [:div.panel.panel-default
          [:div.panel-heading
           [:h4 [:a {:data-toggle "collapse" :data-parent "#accordian" :href "#firstyear"} "First Year: 2012 - 2013 | GPA: 3.50"]]]
          [:div#firstyear.panel-collapse.collapse
           [:div.panel-body
            [:ul.list-group
             [:li.list-group-item "Operating System Fundamentals A"]
             [:li.list-group-item "Database Fundamentals A"]
             [:li.list-group-item "Statistics B+"]
             [:li.list-group-item "Social Media Communications C"]
             [:li.list-group-item "Object Oriented System Analysis C+"]
             [:li.list-group-item "Software Development 2 A"]
             [:li.list-group-item "Learning to Learn B+"]
             [:li.list-group-item "Discrete Mathemathics 1 A"]
             [:li.list-group-item "Business & Information Systems B"]
             [:li.list-group-item "Fundamentals of Interface & Web B+"]
             [:li.list-group-item "Computer Architecture A"]
             [:li.list-group-item "Software Development 1 A"]]]]]]]

       [:h2 "Pearse College of further education"]
       [:div.row
        [:div#accordian2.panel-group.col.xs-12.col-md-6
         [:div.panel.panel-default
          [:div.panel-heading
           [:h4
            [:a {:data-toggle "collapse" :data-parent "#accordian2" :href "#fetaclvl6"} "Fetac Level 6: 2011 - 2012 | Distinction"]]]
          [:div#fetaclvl6.panel-collapse.collapse
           [:div.panel-body
            [:ul.list-group
             [:li.list-group-item "Internet"]
             [:li.list-group-item "SpreadSheets"]
             [:li.list-group-item "Word Processing"]
             [:li.list-group-item "Business Management"]
             [:li.list-group-item "Relational Databases"]
             [:li.list-group-item "Web Authoring"]
             [:li.list-group-item "System Support"]]]]]
         [:div.panel.panel-default
          [:div.panel-heading
           [:h4
            [:a {:data-toggle "collapse" :data-parent "#accordian2" :href "#fetaclvl5"} "Fetac Level 5: 2010 - 2011 | Merit"]]]
          [:div#fetaclvl5.panel-collapse.collapse
           [:div.panel-body
            [:ul.list-group
             [:li.list-group-item "Database Methods"]
             [:li.list-group-item "Computer Architecture & Systems"]
             [:li.list-group-item "Computer Programming"]
             [:li.list-group-item "Mathemathics for Computing"]
             [:li.list-group-item "Networking Essentials"]
             [:li.list-group-item "Communication"]
             [:li.list-group-item "Web Authoring"]]]]]
         [:div.panel.panel-default
          [:div.panel-heading
           [:h4
            [:a {:data-toggle "collapse" :data-parent "#accordian2" :href "#repeatyear"} "Repeat Leaving Cert: 2009 - 2010"]]]
          [:div#repeatyear.panel-collapse.collapse
           #_[:div.panel-body "stuff"]]]]]]
      [:aside.row.container
       [:h1 "Merits and Awards"]
       [:ul.list-group.col-xs-12.col-md-6
        [:li.list-group-item "Zero Days missed - Secondary School"]
        [:li.list-group-item "Trinity Access Program (TAP)"]]])))