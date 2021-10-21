package com.metanit.basics.conditionalconstruction

fun main() {
    // if...else
    val a = 10
    if (a == 10) {
        println("a равно 10")
    } else if (a == 9) {
        println("a равно 9")
    } else if (a == 8) {
        println("a равно 8")
    } else {
        println("a имеет неопределенное значение")
    }

    // возвращение значения из 'if'
    val a1 = 10
    val b1 = 20
    val c1 = if (a1 > b1) a1 else b1

    println(c1)  // 20

    val a2 = 10
    val b2 = 20
    val c2 = if (a2 > b2) {
        println("a2 = $a2")
        a2
    } else {
        println("b2 = $b2")
        b2
    }

    // Конструкция when (аналог switch-case)
    //    when(объект){
    //
    //        значение1 -> действия1
    //        значение2 -> действия2
    //
    //        значениеN -> действияN
    //    }

    var a3 = 10
    when (a3) {
        10 -> {
            println("a3 = 10")
            a3 *= 2
        }
        20 -> {
            println("a3 = 20")
            a3 *= 5
        }
        else -> {
            println("неопределенное значение")
        }
    }
    println(a3)

    // Сравнение с набором значений
    val a4 = 10
    when (a4) {
        in 10..19 -> println("a4 в диапазоне от 10 до 19")
        in 20..29 -> println("a4 в диапазоне от 20 до 29")
        !in 10..20 -> println("a4 вне диапазона от 10 до 20")
        else -> println("неопределенное значение")
    }

    // when и динамически вычисляемые значения
    val a5 = 10
    val b5 = 26
    when (val c5 = a5 + b5) {
        10 -> println("a5 + b5 = 10")
        20 -> println("a5 + b5 = 20")
        else -> println("c5 = $c5")
    }

    // when как альтернатива для if...else
    val a6 = 15
    val b6 = 6
    when {
        (b6 > 10) -> println("b6 больше 10")
        (a6 > 10) -> println("a6 больше 10")
        else -> println("и a6, и b6 меньше или равны 10")
    }

    // Возвращение значения
    val sum = 1000

    val rate = when (sum) {
        in 100..999 -> 10
        in 1000..9999 -> 15
        else -> 20
    }
    println(rate)
}