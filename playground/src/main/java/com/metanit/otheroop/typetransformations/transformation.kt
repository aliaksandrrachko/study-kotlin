package com.metanit.otheroop.typetransformations

fun main() {
    // Встроенные методы преобразования типов
    val s: String = "12"
    val d: Int = s.toInt()
    println(d)

    // Smart cast и оператор is
    // значение is тип_данных
    val tom = Person("Tom")
    val bob = Employee("Bob", "JetBrains")

    checkEmployment(tom)    // Tom does not have a job
    checkEmployment(bob)    // Bob works in JetBrains

    // Ограничения умных преобразований

    // Явные преобразования и оператор as
    // значение as тип_данных
    val hello: String? = "Hello Kotlin"
    val message: String = hello as String
    val messageTwo: String? = hello as? String
    println(messageTwo)
    println(message)



}

fun checkEmployment(person: Person) {
    // println("${person.name} works in ${person.company}")    // Ошибка - у Person нет свойства company
    if (person is Employee) {
        println("${person.name} works in ${person.company}")
    } else {
        println("${person.name} does not have a job")
    }
}

open class Person(val name: String){
    var phone: Phone = SmartPhone("Pixel 5", "Android")
}

open class Phone(val name: String)
class SmartPhone(name: String, val os: String) : Phone(name)

open class Employee(name: String, val company: String): Person(name)
class Manager(name: String, company: String): Employee(name, company)

fun identifyPerson(person: Person){

    when(person){
        is Manager -> println("${person.name} is a manager")
        is Employee -> println("${person.name} is an employee")
        is Person -> println("${person.name} is just a person")
    }
}

