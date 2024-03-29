package com.metanit.generics.common

// Обобщенные классы
class Person<T>(val id: T, val name: String) {

    fun checkId(_id: T) {
        if (id == _id) {
            println("The same")
        } else {
            println("Different")
        }
    }
}

class Word<K, V>(val source: K, var target: V)

fun main() {

    val tom: Person<Int> = Person(367, "Tom")
    val bob: Person<String> = Person("A65", "Bob")

    println("${tom.id} - ${tom.name}")
    println("${bob.id} - ${bob.name}")

    var word1: Word<String, String> = Word("one", "один")
    var word2: Word<String, Int> = Word("two", 2)

    println("${word1.source} - ${word1.target}")    // one - один
    println("${word2.source} - ${word2.target}")    // two - 2

    display("Hello Kotlin")
    display(1234)
    display(true)


    val arr1 = getBiggest(arrayOf(1,2,3,4), arrayOf(3, 4, 5, 6, 7, 7))
    arr1.forEach { item -> print("$item ") }    // 3  4  5  6  7  7
    println()
    val arr2 = getBiggest(arrayOf("Tom", "Sam", "Bob"), arrayOf("Kate", "Alice"))
    arr2.forEach { item -> print("$item ") }    // Tom  Sam  Bob
}

// Обобщенные функции
fun <T: Any?> display(obj: T) {
    println(obj)
}

fun <T> getBiggest(args1: Array<T>, args2: Array<T>): Array<T>{
    if(args1.size > args2.size) return args1
    else return  args2
}




