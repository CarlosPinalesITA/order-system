package com.carlospinales.ordersystem.domain;

public record Cancelled(String reason) implements OrderStatus{
}
