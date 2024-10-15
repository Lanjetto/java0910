package com.nexign.helloJava.examples;

import com.nexign.helloJava.examples.model.Person;

import java.math.BigDecimal;
import java.util.Arrays;

public class Calculator {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static <T extends Number> int sum(T a, T b) {
        return a.intValue() + b.intValue();
    }

    public static BigDecimal subtractSalary(Person p1, Person p2) {
        BigDecimal salary1 = p1.getSalary();
        BigDecimal salary2 = p2.getSalary();
        String s = "Hello world one two";
        char c = s.charAt(1);


        String[] s1 = s.split(" ");


        System.out.println(Arrays.toString(s1));
        return salary1.subtract(salary2);

    }

    public static void calculateArmstrong() {
        for (int i = 100; i < 1000; i++) {
            int sum = 0;
            int temp = i;

            while (temp != 0) {
                int digit = temp % 10;
                sum+= (int) Math.pow(digit, 3);
                temp /= 10;
            }

            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
