package com.metanit.oop.abstracts

abstract class Human(val name: String) {
    // Абстрактные методы не имеют реализации
    // Для абстрактных свойств не указываются значения
    abstract var age: Int
    abstract fun hello()
}

class Person(name: String) : Human(name) {

    override var age: Int = 1
    override fun hello() {
        println("My name is $name")
    }
}

fun main() {

    val kate: Person = Person("Kate")
    val slim: Human = Person("Slim Shady")
    kate.hello()    // My name is Kate
    slim.hello()    // My name is Slim Shady
}

// абстрактный класс фигуры
abstract class Figure {
    // абстрактный метод для получения периметра
    abstract fun perimeter(): Float

    // абстрактный метод для получения площади
    abstract fun area(): Float
}

// производный класс прямоугольника
class Rectangle(val width: Float, val height: Float) : Figure() {
    // переопределение получения периметра
    override fun perimeter(): Float {
        return width * 2 + height * 2
    }

    // переопрелеление получения площади
    override fun area(): Float {
        return width * height
    }
}