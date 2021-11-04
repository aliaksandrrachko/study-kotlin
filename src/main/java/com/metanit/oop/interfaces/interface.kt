package com.metanit.oop.interfaces

interface Movable {
    var speed: Int  // объявление свойства
    fun move()      // определение функции без реализации
    fun stop() {     // определение функции с реализацией по умолчанию
        println("Остановка")
    }
}

class Car : Movable {

    override var speed = 60
    override fun move() {
        println("Машина едет со скоростью $speed км/ч")
    }
}

class Aircraft : Movable {

    override var speed = 600
    override fun move() {
        println("Самолет летит со скоростью $speed км/ч")
    }

    override fun stop() {
        println("Приземление")
    }
}

fun main() {

    val m1: Movable = Car()
    val m2: Movable = Aircraft()
    // val m3: Movable = Movable() напрямую объект интерфейса создать нельзя

    m1.move()
    m1.stop()
    m2.move()
    m2.stop()
}

// ======================================================
interface Info{
    val model: String
        get() = "Undefined"
    val number: String
}

class CarTwo(override val model: String, override var number: String) : Movable, Info{

    override var speed = 60
    override fun move(){
        println("Машина едет со скоростью $speed км/ч")
    }
}

// === Правила переопределения ===
open class Video {
    open fun play() { println("Play video") }
}

interface AudioPlayable {
    fun play() { println("Play audio") }
}

class MediaPlayer() : Video(), AudioPlayable {
    // Функцию play обязательно надо переопределить
    override fun play() {
        super<Video>.play()         // вызываем Video.play()
        super<AudioPlayable>.play() // вызываем AudioPlayable.play()
    }
}