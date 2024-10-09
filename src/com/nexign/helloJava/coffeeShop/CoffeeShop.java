package com.nexign.helloJava.coffeeShop;

import com.nexign.helloJava.coffeeShop.coffee.Coffee;

public class CoffeeShop {
    private final CoffeeMachine coffeeMachine;
    private int profit;

    public CoffeeShop() {
        this.coffeeMachine = new CoffeeMachine();
    }

    public CoffeeMachine getCoffeeMachine() {
        return coffeeMachine;
    }

    public int getProfit() {
        return profit;
    }

    public Coffee doOrder(Order order, int payment) throws IllegalArgumentException {
        int cost = order.getName().getCost();
        if (payment < cost) {
            throw new IllegalArgumentException("Оплаты " + payment + " не достаточно для этого напитка");
        }
        profit+= payment;
        System.out.println("Заказ " + order.getName() + " оплачен и выдан");
        return coffeeMachine.createCoffee(order);
    }
}
