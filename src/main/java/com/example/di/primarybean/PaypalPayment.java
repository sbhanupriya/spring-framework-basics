package com.example.di.primarybean;

public class PaypalPayment implements  PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("Paypal Payment");
    }
}
