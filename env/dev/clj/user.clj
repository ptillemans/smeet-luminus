(ns user
  (:require [smeet-luminus.config :refer [env]]
            [clojure.spec.alpha :as s]
            [expound.alpha :as expound]
            [mount.core :as mount]
            [smeet-luminus.figwheel :refer [start-fw stop-fw cljs]]
            [smeet-luminus.core :refer [start-app]]))

(alter-var-root #'s/*explain-out* (constantly expound/printer))

(defn start []
  (mount/start-without #'smeet-luminus.core/repl-server))

(defn stop []
  (mount/stop-except #'smeet-luminus.core/repl-server))

(defn restart []
  (stop)
  (start))


