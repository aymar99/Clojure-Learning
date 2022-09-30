; https://www.hackerrank.com/challenges/prefix-compression/problem

(def str1 (read-line))
(def str2 (read-line))
(def res (apply str (for [i (range (max (count str1) (count str2))) :while (= (get str1 i) (get str2 i))] (if (= (get str1 i)(get str2 i)) (get str1 i)))))
(println (count res) res)
(println (- (count str1) (count res)) (subs str1 (count res) (count str1)))
(println (- (count str2) (count res)) (subs str2 (count res) (count str2)))
