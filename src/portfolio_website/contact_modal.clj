(ns portfolio-website.contact-modal
  (:require [hiccup
             [core :as hic]
             [util :refer [to-uri]]]))

(def contact-modal
  (hic/html
    [:div#contact-modal.modal.fade {:role "dialog"}
     [:div.modal-dialog
      [:div.modal-content
       [:header.modal-header
        [:button.close {:type "button" :data-dismiss "modal"} "&times;"]
        [:h3 "Email me"]]
       [:div.modal-body
        [:form.form
         [:div.form-group
          [:label {:for "eml"} "Email"]
          [:input#eml.form-control {:type "email" :placeholder "email@email.com" :required true :name "eml"}]]
         [:div.form-group
          [:label {:for "phn"} "Phone"]
          [:input#phn.form-control {:type "tel" :value "+353" :name "phn"}]]
         [:div.form-group
          [:label {:for "sbj"} "Subject"]
          [:input#sbj.form-control {:type "text" :max 40 :placeholder "Subject" :required true :name "sbj"}]]
         [:div.form-group
          [:label {:for "mge"} "Message"]
          [:textarea#mge.form-control {:rows 10 :maxlength 1024 :required true :placeholder "Reasons for emailing :)" :name "mge"}]]
         [:div.form-group
          [:button.btn.btn-success.col-xs-offset-9.disabled {:type "submit" :data-toggle "tooltip" :title "disabled due to processing error"} "Submit"]]]]]]]))