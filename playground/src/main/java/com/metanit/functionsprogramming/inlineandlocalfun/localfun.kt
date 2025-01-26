package com.metanit.functionsprogramming.inlineandlocalfun

fun compareAge(age1: Int, age2: Int){

    fun ageIsValid(age: Int): Boolean{
        return age in 1..110
    }
    if( !ageIsValid(age1) || !ageIsValid(age2)) {
        println("Invalid age")
        return
    }

    when {
        age1 == age2 -> println("age1 == age2")
        age1 > age2 -> println("age1 > age2")
        age1 < age2 -> println("age1 < age2")
    }
}

fun main() {
    compareAge(20, 23)
    compareAge(-3, 20)
    compareAge(34, 134)
    compareAge(15, 8)
}