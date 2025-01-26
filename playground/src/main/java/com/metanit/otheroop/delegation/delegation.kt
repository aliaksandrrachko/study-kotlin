package com.metanit.otheroop.delegation

import kotlin.reflect.KProperty

// val/var имя_свойства: тип_данных by выражение

fun main() {
    val tom = Person("Tom", 37)
    println(tom.age)    //37
    tom.age = 38
    println(tom.age)    //38
    tom.age = -139
    println(tom.age)    //38
}

class Person(_name: String, _age: Int) {
    val name: String by LoggerNameDelegate(_name)
    var age: Int by LoggerAgeDelegate(_age)
}

class LoggerNameDelegate(private val personName: String) {
    operator fun getValue(thisRef: Person, property: KProperty<*>): String {
        println("Запрошено свойство ${property.name}")
        println("Устанавливаемое значение: $personName")
        return personName
    }
}

class LoggerAgeDelegate(private var personAge: Int) {
    operator fun getValue(thisRef: Person, property: KProperty<*>): Int {
        return personAge
    }

    operator fun setValue(thisRef: Person, property: KProperty<*>, value: Int) {
        println("Устанавливаемое значение: $value")
        if (value in 1..109) personAge = value
    }
}

// Изменяемые свойства
// thisRef: должен представлять тот же тип, что и свойство, к которому применяется делегат. Это может быть и родительский тип.
// property: должен представлять тот же тип KProperty<*> или его родительский тип
// value: должен представлять тот же тип, что и свойство, или его родительский тип

