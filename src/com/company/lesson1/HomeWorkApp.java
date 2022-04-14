package com.company.lesson1;

public class HomeWorkApp {
    public static void main () {
        printThreeWords ();
    }
    public static void printThreeWords() {
        System.out.print("Orange" + "Banana" + "Apple");
    }

    public static void checkSumSign()  {
        int a = -20;
        int b = 15;
        if (a + b >= 0) {
            System.out.println("сумма положительная");
        }  else  {
            System.out.println("сумма отрицательная");
        }
    }

}
