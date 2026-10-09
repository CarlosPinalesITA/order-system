package com.carlospinales.ordersystem.repository;

import com.carlospinales.ordersystem.domain.OrderItem;

import java.util.List;

public class OrderRepository {
    public void save(List<OrderItem> items) {
        System.out.println("Saving order to database...");
    }
}
