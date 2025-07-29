package com.omkar.design.patterns.DependencyInjection.Example1;

public class Main {
    public static void main(String[] args) {

        Restaurant mcDonalds = new McDonalds();
        Customer customer1 = new Customer(mcDonalds);
        customer1.eat();

        Restaurant dominos = new Dominos();
        Customer customer2 = new Customer(dominos);
        customer2.eat();
    }
}
