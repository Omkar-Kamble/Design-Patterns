package com.omkar.design.patterns.DependencyInjection.Example1;

public class McDonalds implements Restaurant{
    @Override
    public void serveFood() {
        System.out.println("Here is your McDonald's meal");
    }
}
