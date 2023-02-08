package com.example.membership.application.service.port.out.command

import com.example.membership.application.domain.order.Order

data class PersistOrderCommand(
    val order: Order
)
