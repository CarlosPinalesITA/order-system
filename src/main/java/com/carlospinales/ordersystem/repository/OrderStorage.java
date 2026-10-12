package com.carlospinales.ordersystem.repository;

import com.carlospinales.ordersystem.domain.OrderItem;

import java.util.List;

public interface OrderStorage {
    void save(List<OrderItem> items);
}
