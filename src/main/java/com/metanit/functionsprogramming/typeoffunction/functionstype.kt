package com.metanit.functionsprogramming.typeoffunction

// Тип функции
// (типы_параметров) -> возвращаемый_тип

// () -> Unit
fun hello() {

    println("Hello Kotlin")
}

//
fun sum(a: Int, b: Int): Int{
    return a + b
}

// Переменные-функции
fun main() {
    // определение переменной
    val message: () -> Unit
    // определение функции
    message = ::hello
    // вызов функции
    message()

    val operation: (Int, Int) -> Int = ::sum
    val result = operation(3, 5)
    println(result)
}

