package com.metanit.functionsprogramming.vararg

fun main(){
    printStrings("1", "2", "3", "4")

    sum(1, 2, 3, 4, 5, 6, 7, 8, 9)

    printUserGroup("PGB-73", "1", "2", "3", count = 1)

    val nums = intArrayOf(1, 2, 3, 4)
    changeNumbers(*nums, koef = 2)
}

fun printStrings(vararg strings: String){
    for(str in strings) println(str)
}

fun sum(vararg numbers: Int){
    var result=0
    for(n in numbers){
        result += n
    }
    println("Sum $result")
}

fun printUserGroup(group: String, vararg users: String, count:Int) {
    println("Group: $group")
    println("Count: $count")
    for(user in users)
        println(user)
}

// Оператор '*'
// Оператор '*' (spread operator) (не стоит путать со знаком умножения) позволяет передать параметру в качестве значения элементы из массива
fun changeNumbers(vararg  numbers: Int, koef: Int){
    for (number in numbers) println(number * koef)
}