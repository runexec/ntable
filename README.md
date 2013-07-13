ntable
======

Clojure namespace dependency table generator

# Install 

```bash
$ mkdir ~/bin/ntable
$ cp ntable-0.1.0-SNAPSHOT-standalone.jar ~/bin/ntable/
$ emacs -nw -q ~/bin/ntable.sh
$ cat ~/bin/ntable.sh
java -jar ~/bin/ntable/ntable-0.1.0-SNAPSHOT-standalone.jar $1
$ chmod +x ~/bin/ntable.sh 
```

# Example output

```bash 
$ ntable.sh chp/src/chp/ > /tmp/out.html
```
<pre>
<h3 style="background:#AFFFFF;">chp/src/chp/routes/example.clj</h3>
<b>:use</b>

chp.core
compojure.core
[chp.html :only [escape]]


<h3 style="background:#AFFFFF;">chp/src/chp/routes/user.clj</h3>
<b>:use</b>

chp.core


<h3 style="background:#AFFFFF;">chp/src/chp/routes/chp.clj</h3>
<b>:use</b>

chp.core
[cheshire.core :only [generate-string]]
[chp.api :only [api->where]]
[chp.builder :only [binding-exist?]]


<h3 style="background:#AFFFFF;">chp/src/chp/clean.clj</h3>
<h3 style="background:#AFFFFF;">chp/src/chp/migration.clj</h3>
<b>:refer-clojure</b>

:exclude
[complement alter drop bigint boolean char double float time]


<b>:use</b>

[chp.db :only [*db*]]
(lobos core connectivity migration)


<h3 style="background:#AFFFFF;">chp/src/chp/password.clj</h3>
<h3 style="background:#AFFFFF;">chp/src/chp/handler.clj</h3>
<b>:use</b>

compojure.core
chp.html
chp.template
[chp.core :exclude [korma-db]]
[chp.api :only [api->where api-dir]]
[chp.db :only [*db*]]
[garden.core :only [css]]


<b>:require</b>

chp.server
[compojure.route :as route]
[korma.db :as kdb]
[korma.core :as kc]
[noir.session :as session]
[chp.routes.chp :refer [chp-builder-paths]]
[chp.routes.example :refer [example-routes]]
[chp.routes.user :refer [user-table-routes]]


<h3 style="background:#AFFFFF;">chp/src/chp/html.clj</h3>
<b>:require</b>

hiccup.core
hiccup.util
hiccup.form
hiccup.element


<h3 style="background:#AFFFFF;">chp/src/chp/server.clj</h3>
<h3 style="background:#AFFFFF;">chp/src/chp/api.clj</h3>
<b>:use</b>

[chp.db :only [*db*]]


<b>:require</b>

[korma.db :as kdb]
[korma.core :as kc]


<h3 style="background:#AFFFFF;">chp/src/chp/package.clj</h3>
<b>:refer-clojure</b>

:exclude
[bigint boolean char double float time]


<b>:use</b>

[chp.schema :only [load-schemas]]
[chp.migration :only [chp-migrate]]
[chp.module :only [mod-enable]]


<h3 style="background:#AFFFFF;">chp/src/chp/template.clj</h3>
<b>:use</b>

chp.core


<h3 style="background:#AFFFFF;">chp/src/chp/builder.clj</h3>
<b>:use</b>

[chp.db :only [*db*]]
[chp.core :exclude [korma-db]]
chp.html
chp.password
[chp.login :exclude [korma-db]]


<b>:require</b>

[korma.core :as kc]
[korma.db :as kdb]
[noir.session :as session]


<h3 style="background:#AFFFFF;">chp/src/chp/login.clj</h3>
<b>:require</b>

[korma.db :as kdb]
[korma.core :as kc]


<b>:use</b>

[chp.db :only [*db*]]
[chp.password :only [password]]


<h3 style="background:#AFFFFF;">chp/src/chp/core.clj</h3>
<b>:use</b>

compojure.core
[noir.session :only [wrap-noir-flash wrap-noir-session]]
[chp.db :only [*db*]]


<b>:require</b>

chp.server
[compojure.handler :as handler]
[clojure.string :as string]
[korma.db :as kdb]
[korma.core :as kc]


<h3 style="background:#AFFFFF;">chp/src/chp/generator.clj</h3>
<b>:use</b>

[chp.core :only [root-path]]


<h3 style="background:#AFFFFF;">chp/src/chp/module.clj</h3>
<b>:require</b>

[clojure.java.io :as io]


<h3 style="background:#AFFFFF;">chp/src/chp/db.clj</h3>
<h3 style="background:#AFFFFF;">chp/src/chp/schema.clj</h3>
<b>:refer-clojure</b>

:exclude
[bigint boolean char double float time]


<b>:use</b>

[chp.db :only [*db*]]
[lobos.core :only [create]]


</pre>
