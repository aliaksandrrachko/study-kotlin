package com.metanit.oop.constructors

fun main() {
    val tom = Person("Tom")
    val bob = Person("Bob")
    val alice = Person("Alice")

    println(tom.name)   // Tom
    println(bob.name)   // Bob
    println(alice.name) // Alice

    val somePersonTwo = PersonTwo("Some person two", 12)
    println(somePersonTwo.toString())

    val firstPersonThree = PersonThree("firstPersonThree", 123)
    val secondPersonThree = PersonThree("secondPersonThree", 14)
    val thirdPersonThree = PersonThree("thirdPersonThree", 14, "JetBrains")
}

// Первичный конструктор после имени класса
class Person constructor(_name: String){
    val name: String = _name
//    OR
//    init {
//        name = _name
//    }
}

// Первичный конструктор и свойства
class PersonTwo (val name: String, val age: Int)

//  Вторичный конструктор и свойства
class PersonThree(_name: String) {
    val name: String = _name
    var age: Int = 0
    var company: String = "Undefined"

    constructor(_name: String, _age: Int): this(_name){
        age = _age
    }

    constructor(_name: String, _age: Int, _company: String): this(_name, _age){
        company = _company
    }
}