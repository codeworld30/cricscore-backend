package com.cricscore.service

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CricScoreServiceApplication

fun main(args: Array<String>) {
    println("Starting service")
    runApplication<CricScoreServiceApplication>(*args)
}