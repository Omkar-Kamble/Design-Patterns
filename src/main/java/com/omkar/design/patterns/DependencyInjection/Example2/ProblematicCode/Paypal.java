package com.omkar.design.patterns.DependencyInjection.Example2.ProblematicCode;

public class Paypal {
    public void proccessPayment(Double amount) {
        System.out.println("Processing ₹ " + amount + " through Paypal");
    }
}
