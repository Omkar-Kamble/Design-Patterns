package com.omkar.design.patterns.DependencyInjection.Example2;

public class Paytm implements PaymentGateway{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing ₹ " + amount + " through Paytm");
    }
}
