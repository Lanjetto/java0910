package com.nexign.helloJava.coffeeShop;

import com.nexign.helloJava.coffeeShop.coffee.*;

public class CoffeeMachine {


    public Coffee createCoffee(Order order) {
        Coffee coffee = switch (order.getName()) {
            case CAPPUCCINO -> new Cappuccino(10., 80, 40);
            case ESPRESSO -> new Espresso(20, 30);
            case LATTE -> new Latte(20., 100., 50.);
        };
        return coffee;
    }
}
