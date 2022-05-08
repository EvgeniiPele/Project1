package com.company.lesson7.example;

public class Cat {
    public String name;
    public int appetite;
    public boolean satiety;
    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public int eat(Plate plate) {
       if (appetite <= plate.getFood()) {
           System.out.println(name + " начал есть, съел " + appetite + " грамм");
           plate.decreaseFood(appetite);
       } else
        System.out.println(name + " не ел,т.к мало еды");
        return 0;
    }

}
