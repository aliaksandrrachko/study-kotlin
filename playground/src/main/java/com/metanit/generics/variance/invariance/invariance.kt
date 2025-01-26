package com.metanit.generics.variance.invariance

interface Messenger<T: Message>

open class Message(val text: String)
class EmailMessage(text: String): Message(text)

fun changeMessengerToEmail(obj: Messenger<EmailMessage>){
    val messenger: Messenger<EmailMessage> = obj
}

fun changeMessengerToDefault(obj: Messenger<Message>) {
    val messenger: Messenger<Message> = obj
}