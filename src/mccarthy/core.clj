(ns mccarthy.core
  (:require [instaparse.core :refer [parser]]))

(def scheme-parser
  (parser (slurp "resources/scheme-grammar.bnf")))

(scheme-parser "(+ (+ 1 2) 1123 2123)")
