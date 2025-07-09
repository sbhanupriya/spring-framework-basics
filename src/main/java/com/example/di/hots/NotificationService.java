package com.example.di.hots;

public class NotificationService{
    public NotificationService(){
        System.out.println("Notification Service default constructor called");
    }
    public NotificationService(MessageSender messageSender){
        System.out.println("Parametrized constructor called");
        this.emailSender = messageSender;
    }
    public void setEmailSender(MessageSender messageSender){
        System.out.println("Setter injection called");
        this.emailSender = messageSender;
    }
    private MessageSender emailSender;

    public void notification(){
        System.out.println("Notification Service called");
        emailSender.send();
    }
}
