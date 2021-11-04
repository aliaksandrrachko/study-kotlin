package com.metanit.coroutines.launchandjob

import kotlinx.coroutines.*

suspend fun main() = coroutineScope{

    val job: Job = launch(start = CoroutineStart.LAZY){
        for(i in 1..5){
            println(i)
            delay(400L)
        }
    }

    delay(1000L)
    job.start()
    println("Start")

    job.cancel()
    println("End")
}