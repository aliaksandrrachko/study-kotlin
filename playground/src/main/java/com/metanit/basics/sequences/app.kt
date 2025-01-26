package com.metanit.basics.sequences

fun main() {
    val numbersRange = 1..5
    for (n in numbersRange) {
        print("$n\t")
    }
    println()

    val charRange = 'a'..'z'
    for (c in charRange) {
        print("$c\t")
    }

    val range1 = 1..5 // 1 2 3 4 5
    val range2 = 5 downTo 1 // 5 4 3 2 1

    val rangeWithStep1 = 1..10 step 2 // 1 3 5 7 9
    val rangeWithStep2 = 10 downTo 1 step 3 // 10 7 4 1

    val rangeUntil1 = 1 until 10 // 1 2 3 4 5 6 7 8 9
    val rangeUntil2 = 1 until 10 // 1 3 5 7 9

    // 'in' and '!in'
    val testRange = 1..5
    var isInTestRange = 5 in testRange
    println(isInTestRange)

    var isNotInTestRange = 6 !in testRange
    println(isNotInTestRange)

    // Перебор последовательности
    for (n in testRange) print("$n \t")
    println()
}