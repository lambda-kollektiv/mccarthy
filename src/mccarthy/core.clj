(ns mccarthy.core
  (:require [instaparse.core :refer [parser visualize]]))

(def parse (parser (slurp "resources/scheme-grammar.bnf")))

(parse "1")
(parse "\"asdasd    asd  asd as d\"")
(parse "fn")
(parse "def")
(parse "list")

(parse "(inc 1)")
(parse "(+ (+ 1 2) 1123 2123)")
(parse "(/ 2 1)")
(parse "(def sum (fn (x y) (+ x y)))")

(parse "(list 12 23 123 )")
