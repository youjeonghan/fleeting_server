package com.example.blinddateserver.application.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {
    @GetMapping("/hello")
    fun 임시테스트():String{
        return "hello, 테스트중이야"
    }
}