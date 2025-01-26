package com.metanit.oop.dataclasses

// При компиляции такого класса компилятор автоматически добавляет в класс функции с определенной реализацией,
// которая учитывает свойства класса, которые определены в первичном конструкторе:
// equals(): сравнивает два объекта на равенство
// hashCode(): возвращает хеш-код объекта
// toString(): возвращает строковое представление объекта
// copy(): копирует данные объекта в другой объект
data class Person(val name: String, val age: Int)

class PersonNoData(val name: String, val age: Int)

fun main() {

    val alice: Person = Person("Alice", 24)
    val kate = alice.copy(name = "Kate")
    println(alice.toString())   // Person(name=Alice, age=24)
    println(kate.toString())    // Person(name=Kate, age=24)

    // Декомпозиция data-класса на переменные
    val (username, userage) = alice
    println("Name: $username  Age: $userage") // Name: Alice  Age: 24

    val aliceNoData: PersonNoData = PersonNoData("AliceNoData", 24)
    println(aliceNoData.toString())
}
