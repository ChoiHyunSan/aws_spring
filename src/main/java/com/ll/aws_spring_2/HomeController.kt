package com.ll.aws_spring_2

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import software.amazon.awssdk.services.s3.S3Client

@RestController
class HomeController(
    private val s3Service : S3Service
) {
    @GetMapping("/")
    fun main(): String {
        return "Hi"
    }

    @GetMapping("/buckets")
    fun buckets(): List<String> {
        return s3Service.getBucketsNames()
    }
}
