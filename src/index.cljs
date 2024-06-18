(ns index)

(defn handler [event _ctx]
  (js/console.log event)
  (js/Promise.resolve (clj->js {:statusCode 200
                                :headers {"Content-Type" "*/*"}
                                :body "hello ClojureScript"})))
; export handler
#js {:handler handler}