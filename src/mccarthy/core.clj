(ns mccarthy.core
  (:require [instaparse.core :refer [parser]]))

(def scheme-parser
  (parser (slurp "resources/scheme-grammar.bnf")))

(scheme-parser "(define (radius 2) 10)")
(scheme-parser "()")
(scheme-parser "radius")
