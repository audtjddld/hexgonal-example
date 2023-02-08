package com.example.membership.application.service.port.`in`.command

import com.example.membership.application.domain.order.OrderItem

data class CreateOrderCommand(
    val price: Long,
    val memberId: Long,
    val orderItems: List<OrderItem>
)
