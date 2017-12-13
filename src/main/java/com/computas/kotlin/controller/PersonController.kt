package com.computas.kotlin.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class PersonController {

    @GetMapping("/person")
    fun getByAge(@RequestParam(value = "age") age: Int) {

    }
}