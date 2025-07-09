package com.example.di.primarybean;

public class StripePayment implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Stripe Payment");
    }
}
