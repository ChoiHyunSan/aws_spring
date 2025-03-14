package com.ll.aws_spring_2

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController(
) {
    @GetMapping("/")
    fun main(): String {
        return "Hi"
    }
}
