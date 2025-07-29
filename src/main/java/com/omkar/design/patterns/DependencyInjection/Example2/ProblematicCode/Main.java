package com.omkar.design.patterns.DependencyInjection.Example2.ProblematicCode;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        processor.makePayment(2000.0);
    }
}
