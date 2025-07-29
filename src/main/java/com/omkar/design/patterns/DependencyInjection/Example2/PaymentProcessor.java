package com.omkar.design.patterns.DependencyInjection.Example2;

public class PaymentProcessor {

    private PaymentGateway paymentGateway;

    public PaymentProcessor(PaymentGateway _paymentGateway) {
        this.paymentGateway = _paymentGateway;
    }

    public void makePayment(double amount) {
        paymentGateway.processPayment(amount);
    }
}
