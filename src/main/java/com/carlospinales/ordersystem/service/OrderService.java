package com.carlospinales.ordersystem.service;

import com.carlospinales.ordersystem.domain.OrderCalculator;
import com.carlospinales.ordersystem.domain.OrderItem;
import com.carlospinales.ordersystem.notification.EmailNotifier;
import com.carlospinales.ordersystem.repository.OrderRepository;

import java.util.List;

public class OrderService {
    private final OrderRepository repository = new OrderRepository();
    private final EmailNotifier notifier = new EmailNotifier();

    public double placeOrder(List<OrderItem> items, String customerEmail){
        double total = OrderCalculator.total(items);
        repository.save(items);
        notifier.sendConfirmation(customerEmail);
        return total;
    }
}
