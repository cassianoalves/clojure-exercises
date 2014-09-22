(ns clojure-exercises.matasano.set1
  (:gen-class)
  (:require [clojure.string :as str]))

;; Convert hex to base64

(def hexMap
    (apply array-map (interleave "0123456789abcdef" (range 0 16))))

(def base64Map
    (apply array-map (interleave "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/" (range 0 64))))

(defn divideNibble [nib]
  (seq [(bit-shift-right nib 2) (bit-and nib 2r0011)]))

(defn hex2nibbleseq [hex-str]
  (map hexMap (str/lower-case hex-str)))

(defn hex2HalfNibble [hex]
  (apply concat
         (map divideNibble
              (hex2nibbleseq hex))))

(defn halfNibble2SixBits [hn]
  (partition-all 3 hn))

(defn hex2base64 [in]
  "")

