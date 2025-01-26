package com.metanit.oop.packages

import com.metanit.oop.packages.email.Message as EmailMessage
import com.metanit.oop.packages.email.send as emailSend

fun main() {

    val newMessage: EmailMessage = EmailMessage("Message's text")
    emailSend(newMessage, "some address")
}