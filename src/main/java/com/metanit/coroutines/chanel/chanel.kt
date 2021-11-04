package com.metanit.coroutines.chanel

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

suspend fun main() = coroutineScope {

    val channel = Channel<Int>()

    launch {
        for (n in 1..5) {
            // отправляем данные через канал
            channel.send(n)
        }
    }

    // получаем данные из канала
    repeat(5) {
        val number = channel.receive()
        println(number)
    }
    println("End")
}