package com.nexign.helloJava.coffeeShop;

import com.nexign.helloJava.coffeeShop.coffee.CoffeeTypes;
import com.nexign.helloJava.examples.model.Person;

public class App {
    public static void main(String[] args) {
        CoffeeShop coffeeShop = new CoffeeShop();
        Person person = new Person("Alex", "Mityasov", 100);
        Order order = new Order(CoffeeTypes.CAPPUCCINO);
        int coffeeCost = order.getName().getCost()  ;
        try {
            coffeeShop.doOrder(order, person.pay(coffeeCost));
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            person.income(coffeeCost);
        }


    }


}
