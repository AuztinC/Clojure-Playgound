(ns playground.flattenSeq-spec
  (:require [speclj.core :refer :all]
    [playground.flattenSeq :refer :all]))

(describe "flatten sequence"
  (context "without built-in function"
    (it "((1) 1) gives (1 1)"
      (should= '(1 1) (my-flatten '((1) 1))))
    (it "123456"
      (should= '(1 2 3 4 5 6) (my-flatten '((1 2) 3 [4 [5 6]]))))
    (it "123456"
      (should= '(1 3 2 4 5 6) (my-flatten '((1 3) 2 [4 [5 6]]))))
    (it "[\"a\" [\"b\"] \"c\"]"
      (should= '("a" "b" "c")  (my-flatten ["a" ["b"] "c"])))
    )

  )