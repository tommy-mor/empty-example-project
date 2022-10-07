(defproject test "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [com.github.jpmonettas/flow-storm-inst "RELEASE" :exclusions [org.clojure/tools.analyzer.jvm]]
                 [com.github.jpmonettas/flow-storm-dbg "RELEASE" :exclusions [org.clojure/tools.analyzer.jvm]]]
  :repl-options {:init-ns test.core})
