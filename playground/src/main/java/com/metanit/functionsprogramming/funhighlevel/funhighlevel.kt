package com.metanit.functionsprogramming.funhighlevel

fun main() {

    // Функция как параметр функции
    displayMessage(::morning)
    displayMessage(::evening)

    action(5, 3, ::sum)
    action(3,5, ::subtract)

    // Возвращение функции из функции
    val selectedAction = selectAction(2)
    println(selectedAction(8, 5))
}

fun displayMessage(mes: () -> Unit) {
    mes()
}

fun morning() {
    println("Good Morning")
}

fun evening() {
    println("Good Evening")
}

fun action(n1: Int, n2: Int, op: (Int, Int) -> Int) {
    val result = op(n1, n2)
    println(result)
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun subtract(a: Int, b: Int): Int {
    return a * b
}

fun empty(a: Int, b: Int): Int {
    return 0
}


fun multiply(a: Int, b: Int): Int {
    return a * b
}

fun selectAction(key: Int): (Int, Int) -> Int{
    // определение возвращаемого результата
    when (key) {
        1 -> return ::sum
        2 -> return ::subtract
        3 -> return ::multiply
        else -> return ::empty
    }
}
