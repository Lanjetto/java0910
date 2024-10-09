package com.nexign.helloJava.coffeeShop;

import com.nexign.helloJava.coffeeShop.coffee.CoffeeTypes;

public class Order {
    private final CoffeeTypes name;

    public Order(CoffeeTypes name) {
        this.name = name;
    }

    public CoffeeTypes getName() {
        return name;
    }
}
