package com.metanit.oop.classes

fun main() {

    val tom: Person
    val bob: Person

    val alice: Person = Person()
    println(alice.name)
    println(alice.age)

    alice.go("some location")
    alice.sayHello()
    alice.personToString()
}

class Person {
    var name: String = "Undefined"
    var age: Int = 18

    fun sayHello() {
        println("Hello, my anme is $name")
    }

    fun go(location: String){
        println("$name goes to $location")
    }

    fun personToString(): String{
        return "Name: $name Age: $age"
    }
}