package by.ales.demo_web_app.controllers

import java.time.Instant
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PingController {

    @GetMapping("/ping") fun ping() = Pong("pong", Instant.now())
}

data class Pong(val detail: String, val timestamp: Instant)