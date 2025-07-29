package com.omkar.design.patterns.DependencyInjection.Example1;

public class Dominos implements Restaurant{
    @Override
    public void serveFood() {
        System.out.println("Here is your Domino's pizza");
    }
}
