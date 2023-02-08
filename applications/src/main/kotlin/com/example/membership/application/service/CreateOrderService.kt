package com.example.membership.application.service

import com.example.membership.application.domain.order.Order
import com.example.membership.application.service.port.`in`.CreateOrderUseCase
import com.example.membership.application.service.port.`in`.command.CreateOrderCommand
import com.example.membership.application.service.port.out.PersistOrderPort
import com.example.membership.application.service.port.out.command.PersistOrderCommand
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class CreateOrderService(
    private val persistOrderPort: PersistOrderPort
) : CreateOrderUseCase {

    @Transactional
    override fun create(command: CreateOrderCommand) {
        val order = Order(
            memberId = command.memberId,
            orderItems = command.orderItems,
            totalPrice = 1000L
        )

        persistOrderPort.persist(PersistOrderCommand(order))
    }

}
