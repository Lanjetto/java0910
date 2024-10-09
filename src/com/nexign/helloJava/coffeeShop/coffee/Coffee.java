package com.nexign.helloJava.coffeeShop.coffee;

public abstract class Coffee {
    private double volume;
    private double blendedBeans;
    private double water;

    public double getVolume() {
        return volume;
    }

    public double getBlendedBeans() {
        return blendedBeans;
    }

    public double getWater() {
        return water;
    }

    public void addIngredient(double ingredient) {
        this.volume += ingredient;
    }

    public Coffee(double blendedBeans, double water) {
        this.volume = blendedBeans + water;
        this.blendedBeans = blendedBeans;
        this.water = water;
    }
}
