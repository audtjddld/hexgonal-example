package com.example.membership.application.service.port.`in`

import com.example.membership.application.service.port.`in`.command.CreateOrderCommand

interface CreateOrderUseCase {
    fun create(command: CreateOrderCommand)
}
