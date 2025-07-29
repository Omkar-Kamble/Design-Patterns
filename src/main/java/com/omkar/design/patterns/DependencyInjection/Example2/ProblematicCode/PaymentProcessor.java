package com.omkar.design.patterns.DependencyInjection.Example2.ProblematicCode;

public class PaymentProcessor {
    private Paypal paypal;

    public PaymentProcessor() {
        this.paypal = new Paypal(); // tightly coupled : violation of separation of concerns
    }

    public void makePayment(Double amount) {
        paypal.proccessPayment(amount);
    }
}
