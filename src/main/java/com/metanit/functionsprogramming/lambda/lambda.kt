package com.metanit.functionsprogramming.lambda

fun main() {

    // Лямбда выражения
    val hello: () -> Unit = {println("Hello Kotlin")}
    hello();

    {println("Kotlin on Metanit.com")}()

    // Передача параметров
    val printer = {message: String -> println(message)}
    printer("Good Bye")

    val sum = {x:Int, y:Int ->
        val result = x + y
        println("$x + $y = $result")
    }

    // Возвращение результата
    val sum1: (x: Int, y: Int) -> Int = {x: Int, y: Int ->  x + y}
    val a = sum(3, 4)
    val b = sum(4, 5)

    val sumAndPrint: (x: Int, y: Int) -> Int = {x: Int, y: Int ->
        val result = x + y
        println("$x + $y = $result")
        result
    }

    // Лямбда выражения как аргументы функций
    val sum2 = {x:Int, y:Int -> x + y}
    doOperation(3, 4, sum2)
    doOperation(3, 4) {a, b -> a * b }

    // Типизация параметров лямбды
    val sum3: (Int, Int) -> Int = {x, y -> x + y}
    doOperation(3, 4, {a, b -> a * b})

    // trailing lambda
    doOperation(3, 4) {a, b -> a * b}

    // Возвращение лямбда выражения из функции
    val action = selectAction(3)
    val result = action(4, 5)
    println(result)

    // Неиспользуемые параметры
    // else -> return { x, y -> 0 }
}

fun selectAction(key: Int): (Int, Int) -> Int {
    // определение возвращаемого результата
    when (key) {
        1 -> return { x, y -> x + y }
        2 -> return { x, y -> x - y }
        3 -> return { x, y -> x * y }
        else -> return { x, y -> 0 }
    }
}

fun doOperation(x: Int, y: Int, op: (Int, Int) -> Int) {
    val result = op(x, y)
    println(result)
}
