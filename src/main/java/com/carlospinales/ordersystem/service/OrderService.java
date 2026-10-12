package com.carlospinales.ordersystem.service;

import com.carlospinales.ordersystem.domain.OrderCalculator;
import com.carlospinales.ordersystem.domain.OrderItem;
import com.carlospinales.ordersystem.notification.OrderNotifier;
import com.carlospinales.ordersystem.repository.OrderStorage;

import java.util.List;

public class OrderService {
    private final OrderStorage repository;
    private final OrderNotifier notifier;

    public OrderService(OrderNotifier notifier, OrderStorage repository){
        this.notifier = notifier;
        this.repository = repository;
    }

    public double placeOrder(List<OrderItem> items, String customerEmail){
        double total = OrderCalculator.total(items);
        repository.save(items);
        notifier.sendConfirmation(customerEmail);
        return total;
    }
}
