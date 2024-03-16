package com.example.fleetingserver.core.adapter.input.controller

import com.example.fleetingserver.core.domain.port.output.UserQueryPort
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController(
    private val userQueryPort: UserQueryPort,
) {
    @GetMapping("/test")
    fun test(): String {
        println(userQueryPort.find(1))
        return "test success ${userQueryPort.find(1)}"
    }

    @GetMapping("/health")
    fun health(): String {
        return "health check"
    }
}
