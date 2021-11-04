package com.metanit.generics.variance.contravariance

// in означает, что обобщенный тип может получать значение типа T через параметр функции
interface Messenger<in T : Message> {
    fun sendMessage(message: T)
}

open class Message(val text: String)
class EmailMessage(text: String) : Message(text)

class InstantMessenger : Messenger<Message> {
    override fun sendMessage(message: Message) {
        println("Send message: ${message.text}")
    }
}

fun main() {
    val messenger: Messenger<EmailMessage> = InstantMessenger() // InstantMessenger - это Messenger<Message>

    val message = EmailMessage("Hi Kotlin")
    messenger.sendMessage(message)
}