(ns smeet-luminus.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [smeet-luminus.core-test]))

(doo-tests 'smeet-luminus.core-test)

