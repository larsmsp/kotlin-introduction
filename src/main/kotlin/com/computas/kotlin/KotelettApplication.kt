package com.computas.kotlin

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotelettApplication

fun main(args: Array<String>) {
  runApplication<KotelettApplication>(*args)
}
