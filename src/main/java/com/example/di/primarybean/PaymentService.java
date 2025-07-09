package com.example.di.primarybean;

public class PaymentService {
    private PaymentStrategy paymentStrategy;
    public PaymentService(){
        System.out.println("Payment Service default constructor called");
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        System.out.println("Payment Service setter called");
        this.paymentStrategy = paymentStrategy;
    }
    public PaymentService(PaymentStrategy paymentStrategy){
        System.out.println("Payment Service default constructor called");
        this.paymentStrategy = paymentStrategy;
    }

    public void payment(){
        this.paymentStrategy.pay();
    }
}
