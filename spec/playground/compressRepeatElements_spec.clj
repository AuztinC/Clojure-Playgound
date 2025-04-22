(ns playground.compressRepeatElements-spec
  (:require [speclj.core :refer :all]
            [playground.compressRepeatElements :refer :all]))

(describe "Compress Repeat Elements"
  (context "testing file"
    (it "[1 1 2] gives [1 2]"
      (should= [1 2] (compress [1 1 2])))
    (it "[1 2 3 2 1]"
      (should=  [1 2 3 2 1]  (compress [1 2 3 2 1])))
    (it "StringTest"
      (should=  ["a" "b" "a"]  (compress ["a" "a" "b" "b" "a" "a"])))
    )
  )