package com.metanit.generics.restrictions

// Ограничения обобщений
fun <T> getBiggest(a: T, b: T): T
        where T : Comparable<T>
//, T : Number
{
    return if (a > b) a
    else b
}

fun main() {

    val result1 = getBiggest(1, 2)
    println(result1)
    val result2 = getBiggest("Tom", "Sam")
    println(result2)

    val email1 = EmailMessage("Hello Kotlin")
    send(email1)
    val sms1 = SmsMessage("Привет, ты спишь?")
    send(sms1)
}

// Обобщения и ограничения в классах
fun <T : Message> send(message: T) {
    println(message.text)
}

interface Message { val text: String }
interface Logger { fun log() }

class EmailMessage(override val text: String) : Message, Logger{
    override fun log() = println("Email: $text")
}
class SmsMessage(override val text: String) : Message, Logger {
    override fun log() = println("SMS: $text")
}
