(ns clojure-exercises.matasano.set1
  (:gen-class))

;; Convert hex to base64

(def hexMap
    (apply assoc {} (interleave
     (vec (.getBytes "0123456789abcdef"))
     (vec (range 0 16)))))

(def base64Map
    (apply assoc {} (interleave
     (vec (.getBytes "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"))
     (vec (range 0 64)))))

(defn hexByteToValue
  [in]
  (+
   (* 16 (hexMap (first in)))
   (hexMap (second in))))
  ;(+ (* 16 (hexMap (first in))) (hexMap (second in))))

(defn hex2bytes [hex]
           (partition 2
                       (.getBytes (.toLowerCase hex)) ))


(defn hex2base64 [in]
  (hex2bytes in))


(first '(51 48))
(hexByteToValue '(49 49))
(partition 2 "3031320A")

(str (vec (\2 \a)))
(hex2bytes "3031320A")


(seq-map (interleave '(\1 \2) '(1 2)))
