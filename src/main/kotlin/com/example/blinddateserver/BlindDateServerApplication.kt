package com.example.blinddateserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FleetingServerApplication

fun main(args: Array<String>) {
	runApplication<FleetingServerApplication>(*args)
}
