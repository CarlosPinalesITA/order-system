package com.carlospinales.ordersystem;

import com.carlospinales.ordersystem.discount.*;
import com.carlospinales.ordersystem.domain.*;
import com.carlospinales.ordersystem.notification.*;
import com.carlospinales.ordersystem.repository.OrderRepository;
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
        OrderService emailService = new OrderService(new EmailNotifier(), new OrderRepository());
        emailService.placeOrder(items,"carlos@gmail.com");

        OrderService smsService = new OrderService(new SmsNotifier(),new OrderRepository());
        smsService.placeOrder(items, "44955-88554");
        /*double total = service.placeOrder(items, "pinalescarlos.ags284@gmail.com");
        System.out.println("Total " + total);*/

        /*SOLID OCP: OPEN/CLOSEND PRINCIPE  AND LSP: LISKOV SUBSTITUTION PRINCIPE*/
        DiscountPolicy policy = new SeasonalDiscount();
        System.out.println(policy.apply(300.0));
        System.out.println(policy.apply(1000.0));
        /*ISP: INTERFACE SEGREGATION PRINCIPE*/
        EmailSender email = new SimpleEmailSender();
        email.sendEmail("carlos@gmail.com", "Your order was confirmed");

        SmsSender sms = new SimpleSmsSender();
        sms.sendSms("449455-552", "Your order was confirmed");
    }

}
