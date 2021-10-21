package com.metanit.functionsprogramming.functionoverloading

fun sum(a: Int, b: Int) : Int{
    return a + b
}

fun sum(a: Double, b: Double) : Double{
    return a + b
}

fun main() {
    val a = sum(1,2)
    val b = sum(1.1, 2.3)
}

