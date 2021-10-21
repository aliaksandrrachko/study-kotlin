package com.metanit.basics.loops

fun main(){
    // For
    //    for(переменная in последовательность){
    //        выполняемые инструкции
    //    }

    for(n in 1..9){
        print("${n * n} \t")
        println()
    }

    for(i in 1..10){
        for(j in 1..10){
            print("${i * j} \t")
        }
        println()
    }

    // Цикл while
    var i = 10
    while (i > 0) {
        println(i * i)
        i--
    }

    // Операторы continue и break
    for(n in 1..8){
        if(n == 5) continue
        println(n * n)
    }

    for(n in 1..5){
        if(n == 5) break
        println(n * n)
    }

}