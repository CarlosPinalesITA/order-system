package com.carlospinales.ordersystem.domain;

public record Shipped(String trackingNumber) implements OrderStatus{
}
