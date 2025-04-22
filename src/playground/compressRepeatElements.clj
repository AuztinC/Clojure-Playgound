(ns playground.compressRepeatElements)

;Write a function that removes consecutive duplicates from a list.
;You're only removing consecutive duplicates — not all duplicates
;(compress [1 1 2 3 3 3 2 2 1])
;;; => [1 2 3 2 1]
;
;(compress ["a" "a" "b" "b" "a" "a"])
;;; => ["a" "b" "a"]
;
;(compress [])
;;; => []
(defn compress [coll]
  (loop [i 0
         new-coll []]
    (if (= i (dec (count coll)))
      (conj new-coll (nth coll i))
      (if (not= (nth coll i) (nth coll (inc i)))
        (recur (inc i) (conj new-coll (nth coll i)))
        (recur (inc i) new-coll)))))