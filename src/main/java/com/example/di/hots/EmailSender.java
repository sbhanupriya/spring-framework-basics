package com.example.di.hots;

public class EmailSender implements MessageSender{
    public EmailSender(){
        System.out.println("Email Sender constructor called");
    }
    @Override
    public void send() {
        System.out.println("Email is sent");
    }
}
