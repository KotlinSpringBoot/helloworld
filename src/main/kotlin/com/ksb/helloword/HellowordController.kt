package com.ksb.helloword

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HellowordController {

    @GetMapping("/hello")
    fun hello(): String {
        return "Hello,World"
    }

}
