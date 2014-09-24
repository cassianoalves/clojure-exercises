(ns clojure-exercises.matasano.set1
  (:gen-class)
  (:require [clojure.string :as str]))

;; Convert hex to base64

(def hexMap
    (apply array-map (interleave "0123456789abcdef" (range 0 16))))

(def base64Map
    (apply array-map (interleave (range -1 64) "=ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/")))

(defn divideNibble [nib]
  (seq [(bit-shift-right nib 2) (bit-and nib 2r0011)]))

(defn hex2nibbleseq [hex-str]
  (map hexMap (str/lower-case hex-str)))

(defn hex2HalfNibble [hex]
  (apply concat
         (map divideNibble
              (hex2nibbleseq hex))))

(defn third [col] (nth col 2))

(defn join3Nibbles [nibs]
  (+ (bit-shift-left (first nibs) 4)
     (bit-shift-left (second nibs) 2)
     (third nibs)))

(defn halfNibble2SixBits [hn]
  (map join3Nibbles (partition-all 3 hn)))

(defn hex2base64 [in]
  (apply str
         (map base64Map
              (halfNibble2SixBits
               (hex2HalfNibble in)))))
