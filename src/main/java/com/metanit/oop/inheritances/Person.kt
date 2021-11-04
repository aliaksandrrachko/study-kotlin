package com.metanit.oop.inheritances

fun main() {

    val bob: Employee = Employee()
    bob.name = "Bob"
    bob.printName()
}

// open class базовый_класс
// class производный_класс: базовый_класс
open class Person {
    var name: String = "Undefined"
    fun printName() {
        println(name)
    }
}

// При наследовании производный класс должен вызывать первичный конструктор
class Employee: Person()

class EmployeeTwo: Person{

    constructor() : super(){

    }
}

// Наследование класс с первичным конструктором
open class PersonThree(val name: String) {
    fun printName() {
        println(name)
    }
}

class EmployeeThree(empName: String): PersonThree(empName)

class EmployeeFour: PersonThree {
    constructor(empName: String): super(empName){}
}



