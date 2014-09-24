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

(deftest divideNibble-test
  (testing "divideNibble")
  (is (= (divideNibble 7) '(1 3))))

(deftest hex2HalfNibble-test
  (testing "hex2HalfNibble")
  (is (= (hex2HalfNibble "17020a1B") '(0 1 1 3 0 0 0 2 0 0 2 2 0 1 2 3))))

(deftest halfNibble2SixBits-test
  (testing "halfNibble2SixBits")
  (is (= (halfNibble2SixBits '(0 1 1 3 0 0 0 2 0 0 2 2)) '(5 48 8 10))))

;(deftest halfNibble2SixBits-testWith1Padding
;  (testing "halfNibble2SixBits")
;  (is (= (halfNibble2SixBits '(0 1 1 3 0 0 0 2)) '(5 48 8 nil))))

;(deftest halfNibble2SixBits-testWith2Padding
;  (testing "halfNibble2SixBits")
;  (is (= (halfNibble2SixBits '(0 1 1 3)) '(5 48 nil nil))))
