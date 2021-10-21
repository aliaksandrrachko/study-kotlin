package com.metanit.functionsprogramming.funreturn

fun main() {
    val a = sum(1 ,2)
    val b = sum(3, 4)
    val c = sum(5, 6)

    hello()
}

fun sum(x:Int, y:Int): Int{
    return  x + y
}

// Тип Unit
fun hello(): Unit{
    println("Hello")
}

