(ns user
  (:require [hiccup2.core :as h]))



(println (str (h/html {:lang "en"}
                      [:head
                       [:meta {:charset "utf-8"}]
                       [:title "Hello World"]]
                      [:body
                       [:h1 "Hello World"]])))
