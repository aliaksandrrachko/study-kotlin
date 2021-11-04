package com.metanit.coroutines.intro

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

// Определение suspend-функции
// Модификатор suspend определяет функцию, которая может приостановить свое выполнение и возобновить его через некоторый период времени
//
suspend fun main() = coroutineScope {
    launch { doWork() }

    println("Hello Coroutines")
}

suspend fun doWork() {
    for (i in 0..5) {
        println(i)
        delay(400L)
    }
}

