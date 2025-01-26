package com.metanit.basics.consoles

fun main(){
    // Вывод на консоль
    print("Hello ")
    print("Kotlin ")
    print("on Metanit.com")
    println()
    println("Kotlin is a fun")

    // Ввод с консоли
    print("Введите имя: ")
    val name = readLine()

    println("Ваше имя: $name")
}