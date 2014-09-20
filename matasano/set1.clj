;; Convert hex to base64

(def hexMap
    (apply assoc {} (interleave
     (vec (.getBytes "0123456789abcdef"))
     (vec (range 0 16))))
  )

(def base64Map
    (apply assoc {} (interleave
     (vec (.getBytes "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"))
     (vec (range 0 64)))
           )
  )


(defn hex2base64 [in]

  (hex2bytes in)

  )

(defn hex2bytes [hex]
  (map hexByteToValue
       (map vec
            (partition 2
                       (.getBytes hex) )
            )
       )
  )


(defn hexByteToValue
  [in]
  (+ (* 16 (hexMap (in 0))) (hexMap (in 1)))

  )

(def actual
  (hex2base64 "49276d206b696c6c696e6720796f757220627261696e206c696b65206120706f69736f6e6f7573206d757368726f6f6d"))
(def expected "SSdtIGtpbGxpbmcgeW91ciBicmFpbiBsaWtlIGEgcG9pc29ub3VzIG11c2hyb29t")

(= actual expected)


;(seq (.getBytes "49"))
(vec '(52 57))

(base64Map 97)