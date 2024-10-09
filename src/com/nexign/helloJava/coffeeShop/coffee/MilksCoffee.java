package com.nexign.helloJava.coffeeShop.coffee;

public class MilksCoffee extends Coffee {
    private double milk;

    public MilksCoffee(double blendedBeans, double water, double milk) {
        super(blendedBeans, water);
        this.milk = milk;
        this.addIngredient(milk);
    }
}
