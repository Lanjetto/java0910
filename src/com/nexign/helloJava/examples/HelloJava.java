package com.nexign.helloJava.examples;

import com.nexign.helloJava.examples.model.*;

import java.math.BigDecimal;
import java.util.*;

/// @author Alex


import static com.nexign.helloJava.examples.Calculator.*;
import static java.util.Arrays.*;

public class HelloJava {
    public static void main(String[] args) {


        Movable[] movables = {new Car(), new Person(), new Helicopter()};
        for (Movable movable : movables) {
            movable.move();
        }


        Point point1 = new Point(2, 4);
        Point point2 = new Point(2, 4);
        System.out.println(point2.equals(point1));


        Object phone0 = new Phone();
        Phone phone1 = new Phone("123", "1");
        Phone phone2 = new Phone();


        Person p1 = new Person() {
            int value;

            public int getValue() {
                return value;
            }
        };

        phone1.receiveCall(p1);



        HelloJava helloJava = new HelloJava();
        helloJava.arrayTest();


        Calculator.calculateArmstrong();

        Random random = new Random();
        int i = random.nextInt(5, 10);
        System.out.println(i);
        if (i % 2 == 0) {
            System.out.println("Четное");
        } else  {
            System.out.println("Нечетное");
        }


//        arrayTest();

        List<Long> listOf = List.of(1L, 2L, 3L);
        long l = 45;
        Integer i1 = 1000;
        Integer i2 = 1000;
//        System.out.println(i1.equals(i2));

//        System.out.println(listOf);
//        sumIntegers();

//        Person p1 = new Person("Alex", "Mitasov", 31, BigDecimal.valueOf(102.0));
        Person p3 = new Person("Alex", "Mitasov", 31, BigDecimal.valueOf(102.0));



//        System.out.println(p1.equals(p3));

        Person p2 = new Person();

        p2.setName("Misha");

        System.out.println(p2);


//        System.out.println(subtractSalary(p1, p2));
//
////        charExperiments();
//
//
//        String s = "Hello World";
//
//
//        float a = 30_000.8645F;
//
//        short b = (short) a;
//

//        System.out.println(b);
    }

    private static void charExperiments() {
        char c1 = 55;
        int a1 = 55;
        char c2 = 67;
        char c3 = 33;

        System.out.printf("Символы: первый %s , второй %s , третий %s ",a1 + c2,c3, 4);
    }

    public static void sumIntegers() {
        System.out.println("Введите число 1: ");
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        System.out.println("Введите число 2: ");
        int s2 = Integer.parseInt(sc.next());
        System.out.println("Результат сложения: ");
        System.out.println(sum(s1, s2));
    }


    public void arrayTest() {
        int[] arr = new int[3];

        Random random = new Random();
        int i = random.nextInt(5, 10);




        arr[0] = 100;

        int[] arrCopy = copyOf(arr, 10);

        arr[0] = 1;

        System.out.println(Arrays.toString(arrCopy));

        int length = arr.length;

        int[][] arr4 = {{1,2,3}, {2,4,5}};


//        arr[3] = 4;

        String[] arr3 = {"one", "two", "three"};

    }

}
