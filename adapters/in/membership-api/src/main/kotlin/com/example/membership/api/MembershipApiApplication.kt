package com.example.membership.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@ComponentScan(basePackages = ["com.example.membership"])
@SpringBootApplication
class MembershipApiApplication

fun main(args: Array<String>) {
    runApplication<MembershipApiApplication>(*args)
}
