package com.example.fleetingserver.application.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {
    @GetMapping("/hello")
    fun 임시테스트():String{
        return "혜진이는 조금 귀엽다.혜진이는 조금 귀엽다.혜진이는 조금 귀엽다.혜진이는 조금 귀엽다.혜진이는 조금 귀엽다.혜진이는 조금 귀엽다.혜진이는 조금 귀엽다." +
                "혜진이는 조금 귀엽다.혜진이는 조금 귀엽다.혜진이는 조금 귀엽다.혜진이는 조금 귀엽다.혜진이는 조금 귀엽다.혜진이는 조금 귀엽다.혜진이는 조금 귀엽다."+
                "혜진이는 조금 귀엽다.혜진이는 조금 귀엽다.혜진이는 조금 귀엽다.혜진이는 조금 귀엽다.혜진이는 조금 귀엽다.혜진이는 조금 귀엽다.혜진이는 조금 귀엽다."+
                "혜진이는 조금 귀엽다.혜진이는 조금 귀엽다.혜진이는 조금 귀엽다.혜진이는 조금 귀엽다.혜진이는 조금 귀엽다.혜진이는 조금 귀엽다.혜진이는 조금 귀엽다."+
                "혜진이는 조금 귀엽다.혜진이는 조금 귀엽다.혜진이는 조금 귀엽다.혜진이는 조금 귀엽다.혜진이는 조금 귀엽다.혜진이는 조금 귀엽다.혜진이는 조금 귀엽다."
    }
}