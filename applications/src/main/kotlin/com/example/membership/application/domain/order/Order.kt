package com.example.membership.application.domain.order

/**
 * Order domain 객체
 */
data class Order(
    var orderId: Long? = null,
    val orderItems: List<OrderItem>,
    val totalPrice: Long,
    val memberId: Long
)
