package com.carlospinales.ordersystem.domain;

public class OrderStatusDescriber {

    /*A sealed interface lets the compiler check that we handle every possible case.*/

    public static String describe(OrderStatus status){
        return switch (status) {
            case Pending pending -> "The order is pending payment.";
            case Paid paid -> "The order was paid. Payment ID: "+ paid.paymentId();
            case Shipped shipped -> "The order has been shipped."+ shipped.trackingNumber();
            case Cancelled cancelled -> "The order has been cancelled."+ cancelled.reason();
        };
    }
}
