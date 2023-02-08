package com.example.membership.application.service.port.out

import com.example.membership.application.domain.order.Order
import com.example.membership.application.service.port.out.command.PersistOrderCommand

interface PersistOrderPort {
    fun persist(persistOrderCommand: PersistOrderCommand): Order
}
