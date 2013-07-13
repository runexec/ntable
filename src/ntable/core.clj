(ns ntable.core
  (:gen-class))

(defn -main 
  "Assumes the first form in a clj file is the ns body"
  [path]
  (let [p (-> path clojure.java.io/file file-seq)
        files (for [_ p
                    :let [dir? (.. _ isDirectory)]
                    :when (and (not dir?)
                               (.. _ getName (endsWith ".clj")))]
                (.. _ getPath))]
    (println "<pre>")
    (doseq [f files
            :let [data (->> f slurp read-string (filter seq?))]]
      (println
       (format "<h3 style=\"background:#AFFFFF;\">%s</h3>" f))
      (doseq [_ data
              :let [-type (first _)
                    data (rest _)]]
        (println
         (format "<b>%s</b>\n" -type))
        (doseq [_ data] (println _))
        (println "\n")))
    (println "</pre>")))
      

      
      
        
        
        
        
        
        
        
        
