package com.carlospinales.ordersystem.notification;

public class EmailNotifier implements OrderNotifier{
    @Override
    public void sendConfirmation(String customerEmail) {
        System.out.println("Sending Email to " + customerEmail);
    }
}
