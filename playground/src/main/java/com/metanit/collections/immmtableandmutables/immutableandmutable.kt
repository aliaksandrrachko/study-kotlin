package com.metanit.collections.immmtableandmutables

// immutable
// mutable
fun main() {
    val numbers : List<Int> = listOf(1, 2, 3, 4, 5)

    // перебор списка
    for (n in numbers){
        print(n)
    }
    println()

    println(numbers.get(1))         // 2
    println(numbers.indexOf(2))     // 1
    println(numbers.lastIndexOf(3)) // 2
    println(numbers.first())        // 1
    println(numbers.last())         // 5
    println(numbers.size)           //5
    println(numbers.contains(4))    // true
    println(numbers.elementAt(1))   // 2
    println(numbers.elementAtOrNull(9))  // null

    val numbers2: MutableList<Int> = mutableListOf(5, 6, 7)

    numbers2.add(12)
    numbers2.add(0, 23)
    numbers2.addAll(0, listOf(-3, -2, -1))
    numbers2.removeAt(0)
    numbers2.remove(5)

    for (n in numbers2){ println(n) }
}