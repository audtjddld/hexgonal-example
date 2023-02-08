package com.example.membership.api.web.model

import com.example.membership.application.domain.order.OrderItem

data class CreateOrderRequest(
    val price: Long,
    val memberId: Long,
    val orderItems: List<OrderItem>
)
