package com.carlospinales.ordersystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemJpaRepository extends JpaRepository<OrderItemEntity, Long> {
//Interface de Spring Data que ya trae save, findById, findAll, delete... sin escribir implementación.
}
