(ns playground.compress_seq_spec
  (:require [speclj.core :refer :all]
            [playground.compress_seq :refer :all]))

(describe "compress seq"
  (it "1"
    (should= '(1 2 3 2 3) (compress-seq [1 1 2 3 3 2 2 3])))
  (it "2"
    (should= '([1 2] [3 4] [1 2]) (compress-seq [[1 2] [1 2] [3 4] [1 2]])))
  (it "3"
    (should= "Leroy" (compress-seq "Leeeeeerrroyyy")))
  )