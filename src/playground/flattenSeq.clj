(ns playground.flattenSeq)

;(= (__ '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))
;(= (__ ["a" ["b"] "c"]) '("a" "b" "c"))
;(= (__ '((((:a))))) '(:a))

(defn my-flatten [seq]
  (loop [i 0 new-list (list)]
    (if (= (count seq) i)
      (sort (reverse new-list))
      (if (coll? (nth seq i))
        (recur (inc i) (concat new-list (my-flatten (nth seq i))))
        (recur (inc i) (conj new-list (nth seq i)))
        ))))

;remove inside coll and loop conj all items inside? col?