package com.metanit.collections.immmtableandmutables

fun main() {
    val items = setOf(1, 2, 3, 4, 5)
    println(items.count())          // 5
    println(items.contains(4))  // true
    println(items.isEmpty())    // false
    println(items.minus(3))     // [1, 2, 4, 5]
    println(items.plus(7))      //  [1, 2, 3, 4, 5, 7]

    for (n in items) {
        print(n)
    }    // 1 2 3 4 5
}