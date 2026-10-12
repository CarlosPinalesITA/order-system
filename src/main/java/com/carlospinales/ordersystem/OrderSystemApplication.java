package com.carlospinales.ordersystem;

import com.carlospinales.ordersystem.discount.*;
import com.carlospinales.ordersystem.domain.*;
import com.carlospinales.ordersystem.notification.EmailSender;
import com.carlospinales.ordersystem.notification.SimpleEmailSender;
import com.carlospinales.ordersystem.notification.SimpleSmsSender;
import com.carlospinales.ordersystem.notification.SmsSender;
import com.carlospinales.ordersystem.service.OrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class OrderSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderSystemApplication.class, args);

        /*RECORD Y SWITCH*/
        OrderStatus status = new Cancelled("the articule");
        System.out.println(OrderStatusDescriber.describe(status));

        /*LAMBDA EJERCICIO 1*/
        List<OrderItem> items = List.of(
                new OrderItem("Laptop", 1, 15000.0),
                new OrderItem("Mouse", 3, 200.0)
                /*new OrderItem("Cable", 5, 50.0)*/
        );
        System.out.println(OrderCalculator.total(items));
        System.out.println(OrderCalculator.bulkProducts(items));

        /**/
        OrderService service= new OrderService();
        double total = service.placeOrder(items, "pinalescarlos.ags284@gmail.com");
        System.out.println("Total " + total);

        /*SOLID OCP: OPEN/CLOSEND PRINCIPE*/
        DiscountPolicy policy = new SeasonalDiscount();
        System.out.println(policy.apply(300.0));
        System.out.println(policy.apply(1000.0));
        /*LSP: LISKOV SUBSTITUTION PRINCIPE*/
        EmailSender email = new SimpleEmailSender();
        email.sendEmail("carlos@gmail.com", "Your order was confirmed");

        SmsSender sms = new SimpleSmsSender();
        sms.sendSms("449455-552", "Your order was confirmed");
    }

}
