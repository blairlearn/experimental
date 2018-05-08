def doStuff() {
    println "Hello"
}

return [
    doStuff: this.&doStuff
]