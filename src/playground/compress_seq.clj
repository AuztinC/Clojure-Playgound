(ns playground.compress_seq)
;Write a function which removes consecutive duplicates from a sequence.
;(= (apply str (__ "Leeeeeerrroyyy")) "Leroy")
;(= (__ [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))
;(= (__ [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))

(defn result [new-seq]
  (if (char? (first new-seq))
    (clojure.string/join (map str new-seq))
    new-seq))

(defn ->new-seq [seq new-seq]
  (if (= (first seq) (second seq))
    new-seq
    (conj new-seq (first seq))))

(defn compress-seq [seq]
  (loop [seq seq new-seq []]
    (if (zero? (count seq))
      (result new-seq)
      (recur
        (next seq)
        (->new-seq seq new-seq)))))