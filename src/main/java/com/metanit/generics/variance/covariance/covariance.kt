package com.metanit.generics.variance.covariance

// out - определение обобщенного типа как ковариантного параметра обобщения
// интерфейс Messenger является ковариантным
interface Messenger<out T: Message>{
    fun writeMessage(text: String): T
}

open class Message(val text: String)
class EmailMessage(text: String): Message(text)

class EmailMessenger(): Messenger<EmailMessage>{
    override fun writeMessage(text: String): EmailMessage {
        return EmailMessage("Email: $text")
    }
}

fun changeMessengerToEmail(obj: Messenger<EmailMessage>){
    val messenger: Messenger<Message> = obj
}

fun main() {

    val messenger: Messenger<Message> = EmailMessenger()
    val message = messenger.writeMessage("Hello Kotlin")
    println(message.text)    // Email: Hello Kotlin
}