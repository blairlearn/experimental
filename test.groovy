//println "Start"
//def inner  = evaluate readFileFromWorkspace("inner.groovy")
//println "Post-eval"
//inner.doStuff()
//println "Fine"

import Nested
def foo = new Nested()
foo.run()
