package com.metanit.oop.gettersandsetters

// var имя_свойства[: тип_свойства] [= инициализатор_свойства]
// [getter]
// [setter]

var age: Int = 18
    set(value){
        if ((value > 0) and (value < 110))
            field = value
    }
    get() {
        println("Call getter")
        return field
    }

fun main() {
    println(age)    // 18
    age = 45
    println(age)    // 45
    age = -345
    println(age)    // 45

    val bob: Person = Person("Bob")
    bob.age = 25        // вызываем сеттер

    println(bob.age)    // 25
    bob.age = -8        // вызываем сеттер
    println(bob.age)    // 25
}

class Person(val name: String){

    var age: Int = 1
        set(value){
            if((value>0) and (value <110))
                field = value
        }
}
