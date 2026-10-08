package com.carlospinales.ordersystem.domain;

import java.util.List;

public class OrderCalculator {
    public static double total(List<OrderItem> items) {
        return items.stream()
                .mapToDouble(item -> item.quantity() * item.unitPrice()) /*A lambda is a short, anonymous function written with an arrow, like x -> x * 2*/
                .sum();
    }
    public static List<String> bulkProducts(List<OrderItem> items){
        return items.stream()
                .filter(item -> item.quantity() > 2)
                .map(item -> item.productName())
                .toList();
    }
}
