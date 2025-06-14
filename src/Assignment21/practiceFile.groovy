package Assignment21


def filename = "sample.txt"
def name = "Agnesh"


try {
    new File(filename).text = name
    println "Name written to file."
} catch (IOException e) {
    println "File write error: ${e.message}"
}


try {
    def readName = new File(filename).text
    println "Name read from file: $readName"
} catch (FileNotFoundException e) {
    println "File not found: ${e.message}"
}


try {
    def a = 10
    def b = 0
    def result = a / b
    println "Result: $result"
} catch (ArithmeticException e) {
    println "Caught divide-by-zero: ${e.message}"
} finally {
    println "Division attempted."
}


class DynamicHandler {
    def methodMissing(String name, args) {
        println "Method $name is not defined"
    }
}

def obj = new DynamicHandler()
obj.someUndefinedMethod(123)


class PropertyHandler {
    def propertyMissing(String name) {
        return "undefined"
    }
}

def propObj = new PropertyHandler()
println "Unknown property value: ${propObj.someUnknownProperty}"


class Person {
    String name
}

def p = new Person(name: "Initial Name")
println "Before change: ${p.name}"


p.metaClass.age = 25
println "Added dynamic property: Age = ${p.age}"


p.metaClass.getName = { -> "Modified Name" }
println "After method modification: ${p.name}"
