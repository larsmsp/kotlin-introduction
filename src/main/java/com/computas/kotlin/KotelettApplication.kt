package com.computas.kotlin

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class KotelettApplication {

    fun main(args: Array<String>) {
        SpringApplication.run(KotelettApplication::class, *args)
    }
}