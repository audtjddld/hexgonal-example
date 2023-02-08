package com.example.membership.api.web

import com.example.membership.api.web.model.CreateOrderRequest
import com.example.membership.application.service.port.`in`.CreateOrderUseCase
import com.example.membership.application.service.port.`in`.command.CreateOrderCommand
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CreateOrderController(
    private val createOrderUseCase: CreateOrderUseCase
) {

    @PostMapping(path = ["v1/orders"])
    fun create(request: CreateOrderRequest) {
        val command = CreateOrderCommand(
            memberId = request.memberId,
            orderItems = request.orderItems,
            price = request.price
        )
        createOrderUseCase.create(command)
    }
}
