(ns smeet-luminus.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [smeet-luminus.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[smeet-luminus started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[smeet-luminus has shut down successfully]=-"))
   :middleware wrap-dev})
