(ns clojure-exercises.matasano.set1-test
  (:require [clojure.test :refer :all]
            [clojure-exercises.matasano.set1 :refer :all]))

(deftest hex2nibbleseq-test
  (testing "hex2nibbleseq")
  (is (= (hex2nibbleseq "12AB") '(1 2 10 11))))


(deftest hex2base64-test
  (testing "Set1 - Chalenge 1 - Convert hex to base64"
    (is (= (hex2base64 "49276d206b696c6c696e6720796f757220627261696e206c696b65206120706f69736f6e6f7573206d757368726f6f6d")
           "SSdtIGtpbGxpbmcgeW91ciBicmFpbiBsaWtlIGEgcG9pc29ub3VzIG11c2hyb29t"))))

