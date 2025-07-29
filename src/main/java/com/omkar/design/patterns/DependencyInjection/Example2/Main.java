package com.omkar.design.patterns.DependencyInjection.Example2;

public class Main {
    public static void main(String[] args) {

        PaymentGateway stripe = new Stripe();
        PaymentProcessor processor1 = new PaymentProcessor(stripe);
        processor1.makePayment(20000);

        PaymentGateway razorPay = new RazorPay();
        PaymentProcessor processor2 = new PaymentProcessor(razorPay);
        processor2.makePayment(50000);

        PaymentGateway paytm = new Paytm();
        PaymentProcessor processor3 = new PaymentProcessor(paytm);
        processor3.makePayment(1000);
    }
}
