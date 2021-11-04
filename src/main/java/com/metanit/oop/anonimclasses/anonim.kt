package com.metanit.oop.anonimclasses

fun main() {

    hello(
        object : Person("Sam"){
            val company = "JetBrains"
            override fun sayHello(){
                println("Hi, my name is $name. I work in $company")
            }
        })

    createPerson("", "").sayHello()
}

fun hello(person: Person) {
    person.sayHello()
}

open class Person(val name: String){
    open fun sayHello(){
        println("Hi, my name is $name")
    }
}

private fun createPerson(_name: String, _company: String) = object{
    val name = _name
    val company = _company
    fun sayHello() = println("Hi, my name is $name. I work in $company")
}