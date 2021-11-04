package com.metanit.otheroop.nullandnullable

fun main() {
    val n = null
    println(n)

    // Можно присвоить значение null только переменной, которая представляет тип Nullable.
    // Int? - nullable тип (с '?')
    // val n : Int = null  //! ошибка, Int не допускает значение null
    val d: Int? = null // норм, Int? допускает значение null

    var bob: Person = Person("Bob")
    // bob = null // ! Ошибка - bob представляет тип Person и не допускает null
    var tom: Person? = Person("Tom")
    tom = null  // норм - tom представляет тип Person? и допускает null

    var message: String? = "Hello"
    //val hello: String = message     // ! Ошибка - hello не допускает значение null

    // у типа String свойство length возвращает длину строки
    //println("Message length: ${message.length}")    // ! Ошибка

    // Оператор '?:'
    var name: String? = "Tom"
    val userName: String = name ?: "Undefined"  // если name = null, то присваивается "Undefined"

    var age: Int? = 23
    val userAge: Int = age ?: 0  // если age равно null, то присваивается число 0

    // Оператор '?.'
    var length: Int? = message?.length
    // it equals to
    if (message != null)
        length = message.length
    else
        length = null

    // Оператор '!!' (not-null assertion operator)
    try {
        val name: String? = "Tom"
        val id: String = name!!
        println(id)
    } catch (e: Exception) {
        println(e.message)
    }
    
    val nameOne: String? = null
    val lengthOne: Int = name!!.length

}

class Person(val name: String)