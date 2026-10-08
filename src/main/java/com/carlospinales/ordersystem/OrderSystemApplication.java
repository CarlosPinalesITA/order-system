package com.carlospinales.ordersystem;

import com.carlospinales.ordersystem.domain.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderSystemApplication.class, args);
        OrderStatus status = new Cancelled("the articule");
        System.out.println(OrderStatusDescriber.describe(status));
    }

}
