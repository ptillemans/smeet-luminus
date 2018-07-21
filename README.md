# smeet-luminus

generated using Luminus version "2.9.12.77"

FIXME

## Prerequisites

You will need [Leiningen][1] 2.0 or above installed.

[1]: https://github.com/technomancy/leiningen

## Running

To start a web server for the application, run:

    lein run

## Configuring for dev and test

To configure the dev/test environment a .edn file can be used.

See[Luminus website page on environment.][http://www.luminusweb.net/docs/environment.html1]

[http://www.luminusweb.net/docs/environment.html1]: https://github.com/technomancy/leiningen


### For development

    ;; WARNING
    ;; The dev-config.edn file is used for local environment variables, such as database credentials.
    ;; This file is listed in .gitignore and will be excluded from version control by Git.

    {:dev true
     :port 3000
     ;; when :nrepl-port is set the application starts the nREPL server on load
     :nrepl-port 7000

     ; set your dev database connection URL here
     ; :database-url "mongodb://127.0.0.1/smeet_luminus_dev"
    }

 Note the *dev* boolean set to true and the *nrepl-port* setting.

### for test


    ;; WARNING
    ;; The test-config.edn file is used for local environment variables, such as database credentials.
    ;; This file is listed in .gitignore and will be excluded from version control by Git.

    {:port 3000

     ; set your test database connection URL here
     ; :database-url "mongodb://127.0.0.1/smeet_luminus_test"
    }


## License

Copyright © 2018 FIXME
