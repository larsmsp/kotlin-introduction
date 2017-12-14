package com.computas.kotlin.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class KotelettController {

    @GetMapping("/person")
    fun getByAge(@RequestParam(value = "weight") age: Int) {

    }
}