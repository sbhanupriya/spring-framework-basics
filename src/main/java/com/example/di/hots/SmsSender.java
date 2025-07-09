package com.example.di.hots;

public class SmsSender implements MessageSender {
    public SmsSender(){
        System.out.println("Sms constructor is called");
    }
    @Override
    public void send() {
        System.out.println("Sms is sent");
    }
}
