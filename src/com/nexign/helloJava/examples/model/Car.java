package com.nexign.helloJava.examples.model;

import com.nexign.helloJava.examples.Movable;

public class Car implements Movable {
    @Override
    public void move() {
        System.out.println("Едет");
    }
}
