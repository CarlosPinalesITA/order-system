package com.carlospinales.ordersystem.notification;

public class SimpleEmailSender implements EmailSender{
    @Override
    public void sendEmail(String to, String message){
        System.out.println("Sending email to " + to + ": " + message);
    }
}
