package com.metanit.oop.delegations

interface Base {
    fun someFun()
}

class BaseImpl : Base {
    override fun someFun() {}
}

class Derived(someBase: Base) : Base by someBase

// ================================
interface Messenger {
    val programName: String

    fun send(message: String)
    fun sendTextMessage()
    fun sendVideoMessage()
}

class InstantMessenger(override val programName: String) : Messenger {

    override fun send(message: String) {
        println("Message `$message` has been sent")
    }

    override fun sendTextMessage() = println("Send text message")
    override fun sendVideoMessage() = println("Send video message")
}

interface PhotoDevice {
    fun takePhoto()
}

class PhotoCamera : PhotoDevice {
    override fun takePhoto() = println("Take a photo")
}

class SmartPhone(val name: String, m: Messenger, p: PhotoDevice) : Messenger by m, PhotoDevice by p {
    override val programName = "Default Messenger"
    override fun sendTextMessage() = println("Send sms")
}

fun main() {
    val telegram = InstantMessenger("Telegram")
    val photoCamera = PhotoCamera()
    val pixel = SmartPhone("Pixel 5", telegram, photoCamera)
    pixel.send("Hello Kotlin")
    pixel.send("Learn Kotlin on Metanit.com")
    pixel.sendTextMessage()
    pixel.sendVideoMessage()
}
