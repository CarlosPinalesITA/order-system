package com.carlospinales.ordersystem.domain;

public record Paid(String paymentId) implements OrderStatus{
}
