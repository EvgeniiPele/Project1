package com.company.lesson2;

import java.sql.SQLOutput;

public class Homework2 {
    public static boolean main(int a, int b) {
        if (a + b > 10 && a + b < 20) {
        }
        return true;
    }
    public static void foo ( int a) {
        if (a >= 0) {
        System.out.println("число положительное");

        } else System.out.println( "число отрицательное");

    }
    public static boolean minus ( int a){
        if (a < 0){
            return true;
        }
        return false;
    }
    public static void foo (int a, String str){
        for (int i = 0; i <=a; i++) {
            System.out.println(str);

        }
    }
}
