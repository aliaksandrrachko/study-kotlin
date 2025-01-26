package com.metanit.coroutines.coroutinesarea

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun main() {
    doWork()
    println("Hello Coroutines")
}

suspend fun doWork() = coroutineScope {
    launch {
        for (i in 0..5) {
            println(i)
            delay(400L)
        }
    }
}