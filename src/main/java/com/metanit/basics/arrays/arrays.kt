package com.metanit.basics.arrays

fun main() {
    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val n = numbers[1]
    numbers[3] = 7
    println("numbers[2] = ${numbers[2]}")

    val strangeNumbers = Array(3, { 5 }) // [5, 5, 5]

    var i = 1
    val strangeNumbers1 = Array(3, { i++ * 2 }) // [2, 4, 6]

    // Перебор массива
    for (n in strangeNumbers1) print("$n\t")
    println()

    while (i in strangeNumbers.indices) {
        println(i)
        i++
    }

    // Проверка наличия элемента в массиве
    println(5 in strangeNumbers)

    // Двухмерные массивы
    val table: Array<Array<Int>> = Array(3, { Array(5, { 0 }) })
    table[0] = arrayOf(1, 2, 3)
    table[1] = arrayOf(4, 5, 6)
    table[2] = arrayOf(7, 8, 9)

    table[0][1] = 6
    val n1 = table[0][1]

    for (row in table) {
        for (cell in row) {
            print("$cell \t")
        }
        println()
    }
}