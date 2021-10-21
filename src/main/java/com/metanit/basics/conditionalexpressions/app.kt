package com.metanit.basics.conditionalexpressions

fun main(){
    // Операции отношения
    // >, < и т.д.

    // Логические операции
    // and:
    val d = (11 >= 5) and (9 < 10)
    println(d)

    // or:
    val d1 = (11 < 5) or (9 > 10)
    println(d1)

    // xor:
    val d2 = true xor (90 > 10)      // false
    println(d2)

    // !:
    val d3 = !false
    println(d3)

    // not() == !:
    val d4 = true.not()
    println(d4)

    // in: возвращает true, если операнд имеется в некоторой последовательности.
    val d5 = 10 in 11..15
    println(d5)

}