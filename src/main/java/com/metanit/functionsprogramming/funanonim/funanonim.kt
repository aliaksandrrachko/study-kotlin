package com.metanit.functionsprogramming.funanonim

fun main() {
    // Анонимная функция
    val sum = fun(x: Int, y: Int): Int = x + y
    val result = sum(5, 4)
    println(result)

    // Анонимная функция как аргумент функции
    val op = fun(x: Int, y: Int): Int = x * y
    doOperation(9, 5, op)

    // Возвращение анонимной функции из функции
    val selectedAction = com.metanit.functionsprogramming.funhighlevel.selectAction(1)
    println(selectedAction(1,4))
}

fun doOperation(x: Int, y: Int, op: (Int, Int) -> Int) {
    val result = op(x, y)
    println(result)
}

fun selectAction(key: Int): (Int, Int) -> Int {
    // определение возвращаемого результата
    return when(key){
        1 -> fun(x: Int, y: Int): Int = x + y
        2 -> fun(x: Int, y: Int): Int = x - y
        3 -> fun(x: Int, y: Int): Int = x * y
        else -> fun(x: Int, y: Int): Int = 0
    }
}