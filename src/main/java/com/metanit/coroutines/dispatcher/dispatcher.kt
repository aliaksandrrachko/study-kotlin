package com.metanit.coroutines.dispatcher

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

suspend fun main() = coroutineScope {

    launch(context = Dispatchers.Default) {
        println("Корутина выполняется на потоке: ${Thread.currentThread().name}")
    }

    println("Функция main выполняется на потоке: ${Thread.currentThread().name}")
}