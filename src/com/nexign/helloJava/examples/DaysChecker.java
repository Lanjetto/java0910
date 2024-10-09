package com.nexign.helloJava.examples;

public class DaysChecker {
    public static void main(String[] args) {

        for (int i = 100; i < 1000; i++) {
            int a1 = i%100;
            int pow = (int) Math.pow(3, 3);

            System.out.println();
        }



        DaysChecker daysChecker = new DaysChecker();
        String day = daysChecker.dayCheck(Integer.parseInt(args[0]));
        System.out.println(day);

        String[] strArr = {"one", "two", "three", "two"};

        daysChecker.iterTest(strArr, "two");

    }

    public String dayCheck(int i) {
        String day = switch (i) {
            case 1 -> "Понедельник";
            case 2 -> "Вторник";
            case 3 -> "Среда";
            case 4 -> "Четверг";
            case 5 -> "Пятница";
            case 6, 7 -> "Выходные";
            default -> "Не тот день";
        };
        return day;
    }



    public void iterTest(String[] arr , String x) {
        //itar
        //fori
        String s = "";
//        for (int i = 0; i < arr.length; i++) {
//            s += arr[i];
//        }
        //iter
        int count = 0;
        for (String i : arr) {
            if (!i.equals(x)) {
                continue;
            }
            count++;
        }

        System.out.println(count);
    }
}
