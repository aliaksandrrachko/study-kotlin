package com.metanit.coroutines.asyncawaitdeferred

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay

// async, await and deferred

// async запускает отдельную корутину, которая выполняется параллельно с остальными корутинами.
// Кроме того, она возвращает объект Deferred, который ожидает получения результата корутины.
suspend fun main() = coroutineScope {

    val message: Deferred<String> = async { getMessage() }
    println("message: ${message.await()}")
    println("Program has finished")

    val numDeferred1 = async{ sum(1, 2)}
    val numDeferred2 = async{ sum(3, 4)}
    val numDeferred3 = async{ sum(5, 6)}
    val num1 = numDeferred1.await()
    val num2 = numDeferred2.await()
    val num3 = numDeferred3.await()

    println("number1: $num1  number2: $num2  number3: $num3")
}

suspend fun getMessage(): String {
    delay(500L)  // имитация продолжительной работы
    return "Hello"
}

suspend fun sum(a: Int, b: Int) : Int{
    delay(500L) // имитация продолжитльной работы
    return a + b
}