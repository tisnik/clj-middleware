;
;  (C) Copyright 2018, 2020, 2021  Pavel Tisnovsky
;
;  All rights reserved. This program and the accompanying materials
;  are made available under the terms of the Eclipse Public License v1.0
;  which accompanies this distribution, and is available at
;  http://www.eclipse.org/legal/epl-v10.html
;
;  Contributors:
;      Pavel Tisnovsky
;

(ns clj-middleware.middleware
  "Definition(s) of middleware used with the cooperation with Clojure Ring library.")

(defn inject-configuration
  "Inject configuration structure into the request parameter.
     It means that the process request -> emender-waive -> response could be implemented
     in a functional way."
  [handler configuration]
  (fn [request]
    (handler (assoc request :configuration configuration))))

