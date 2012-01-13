(defproject com.draines/postal "1.7.1"
  :repositories {"java.net" "http://download.java.net/maven/2"}
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [javax.mail/mail "1.4.4"
                  :exclusions [javax.activation/activation]]
                 [org.clojure.contrib/repl-utils "1.3.0-alpha4"]])
