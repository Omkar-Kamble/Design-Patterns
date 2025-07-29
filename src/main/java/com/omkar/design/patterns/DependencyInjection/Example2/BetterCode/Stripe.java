package com.omkar.design.patterns.DependencyInjection.Example2.BetterCode;

public class Stripe implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing ₹ " + amount + " through Stripe");
    }
}
