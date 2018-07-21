(ns smeet-luminus.app
  (:require [smeet-luminus.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
