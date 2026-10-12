package com.carlospinales.ordersystem.notification;

public class SmsNotifier implements OrderNotifier{
    @Override
    public void sendConfirmation(String contact){
        System.out.println("Sending SMS to " + contact);
    }
}
