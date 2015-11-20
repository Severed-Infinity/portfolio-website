(ns portfolio-website.education-page
  (:require [hiccup.core :as hic]
            [portfolio-website.pages-core :as pages]))

(def education-page
  (pages/page
    "Education - David Swift"
    (hic/html
      [:section
       [:h1 "Education and Results"]
       [:ul
        [:li "IT-Tallaght"
         [:ol
          [:li "Fourth Year"]
          [:li "Third Year"]
          [:li "Second Year"]
          [:li "First Year"]]]
        [:li "Pearse College of further education"
         [:ol
          [:li "Fetac Level 6"]
          [:li "Fetac Level 5"]
          [:li "Repear Leaving Cert"]]]
        [:li "St. Marks Community School"]]]
      [:aside
       [:h1 "Merits and Awards"]
       [:ul
        [:li "Zero Days missed"]
        [:li "Trinity Access Program (TAP)"]]])))