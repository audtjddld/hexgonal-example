package com.example.membership.application.domain.order

data class OrderItem(
    val id: Long,
    val name: String,
    val count: Long,
    val price: Long
)
