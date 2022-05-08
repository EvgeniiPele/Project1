package com.company.lesson6.example;

public class Dog extends Animal {
    public Dog(String name, int run, int swim) {
        super(name, run, swim);
    }

    public static void main(String[] args) {
        run(20);
        swim(10);
    }

    private static int MAX_RUN_LENGTH = 500;

    public static void run(int length) {
        if (length > 0 && length <= MAX_RUN_LENGTH) {
            System.out.println("Cat run " + length + " meters");
        } else if (length > MAX_RUN_LENGTH) {
            System.out.println("Cat ran" + MAX_RUN_LENGTH + "and got tired");
        } else System.out.println("Cat didn't run");
    }

    public static void swim(int length) {
        System.out.println("Cat can't swim");
    }
}
