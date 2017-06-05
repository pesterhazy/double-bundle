(ns double-bundle.core
  (:require [reagent.core :as reagent :refer [atom]]
            [goog.object :as gobj]))

(enable-console-print!)

(println "This text is printed from src/double-bundle/core.cljs. Go ahead and edit it and see reloading in action.")

;; define your app data so that it doesn't get over-written on reload

(defonce app-state (atom {:text "Hello world!"}))

(defn datetime []
  [:> (gobj/get js/window "ReactDatetime") {:input false}])

(defn hello-world []
  [:div
   [:h1 (:text @app-state)]
   [datetime]])

(reagent/render-component [hello-world]
                          (. js/document (getElementById "app")))

(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
)
