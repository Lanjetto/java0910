package com.nexign.helloJava.coffeeShop.coffee;

public enum CoffeeTypes {
    LATTE(100), CAPPUCCINO(200), ESPRESSO(50);
    private final int cost;

    CoffeeTypes(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }
}
