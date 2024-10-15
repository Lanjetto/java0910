package com.nexign.helloJava.examples.model;

import java.math.BigDecimal;

public class Employee extends Person {
    private String job;

    public Employee(String name, String lastName, int age, BigDecimal salary, String job) {
        super(name, lastName, age, salary);
        this.job = job;
    }

    public void doJob() {
        System.out.println("IM WORKIN'");
    }


    public void talk() {
        System.out.println("Talk abut work");
    }

    public static void main(String[] args) {
        Person p = new Employee("A", "M", 12, BigDecimal.TEN, "Job");

        p.talk();
        String name1 = p.name;
//        p.doJob();


    }
}

