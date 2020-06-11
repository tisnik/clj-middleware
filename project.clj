;
;  (C) Copyright 2018, 2020  Pavel Tisnovsky
;
;  All rights reserved. This program and the accompanying materials
;  are made available under the terms of the Eclipse Public License v1.0
;  which accompanies this distribution, and is available at
;  http://www.eclipse.org/legal/epl-v10.html
;
;  Contributors:
;      Pavel Tisnovsky
;

(defproject org.clojars.tisnik/clj-middleware "0.1.0-SNAPSHOT"
    :description "Simple Ring middleware to inject configuration structure into the request parameter."
    :url "https://github.com/tisnik/clj-middleware"
    :license {:name "Eclipse Public License"
              :url "http://www.eclipse.org/legal/epl-v10.html"}
    :dependencies [[org.clojure/clojure "1.8.0"]]
    :plugins [[test2junit "1.1.0"]
              [codox "0.8.11"]
              [lein-cloverage "1.0.6"]]
    :target-path "target/%s"
    :profiles {:uberjar {:aot :all}})
