package com.nexign.helloJava.examples.model;

import com.nexign.helloJava.examples.Movable;

public class Helicopter implements Movable {
    @Override
    public void move() {
        System.out.println("Летит");
    }
}
