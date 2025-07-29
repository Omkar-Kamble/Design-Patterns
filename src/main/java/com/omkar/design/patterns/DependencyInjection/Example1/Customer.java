package com.omkar.design.patterns.DependencyInjection.Example1;

public class Customer {

    private Restaurant restaurant;

    public Customer(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void eat() {
        restaurant.serveFood();
    }
}
