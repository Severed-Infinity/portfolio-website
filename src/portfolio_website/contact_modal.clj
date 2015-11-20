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
        [:form.form {:action "MAILTO:masterdavidswift@hotmail.com" :method "post"}
         [:div.form-group
          [:label {:for "email"} "Email"]
          [:input#email.form-control {:type "email" :placeholder "email@email.com" :required true}]]
         [:div.form-group
          [:label {:for "phone"} "Phone"]
          [:input#phone.form-control {:type "tel" :value "+353"}]]
         [:div.form-group
          [:label {:for "subject"} "Subject"]
          [:input#subject.form-control {:type "text" :max 40 :placeholder "Subject" :required true}]]
         [:div.form-group
          [:label {:for "message"} "Message"]
          [:textarea#message.form-control {:rows 10 :maxlength 1024 :required true :placeholder "Reasons for emailing :)"}]]
         [:div.form-group
          [:button.btn.btn-success.col-xs-offset-10 {:type "submit"} "Submit"]]]]
       [:div.modal-footer
        ]]
      ]]))