package com.company.lesson7.example;

public class Plate {
    private int food;

    public Plate(int foodQuantity) {
        this.food = foodQuantity;
    }

    public int getFood() {
        return food;
    }

    public void info() {
        System.out.println("В тарелке " + food + " грамм еды");
    }
    public void decreaseFood (int foodQuantity){
        this.food -= foodQuantity;
    }
    public void increaseFood (int foodQuantity) {
        this.food += foodQuantity;
    }
}
