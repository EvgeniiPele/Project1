package com.company.lesson7.example;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int action;
            Cat[] allCats = new Cat[4];
            allCats[0] = new Cat("Барсик", 5, false);
            allCats[1] = new Cat("Снежок", 30, false);
            allCats[2] = new Cat("Мурзик", 10, false);
            allCats[3] = new Cat("Чернышка", 45, false);
            Plate plate = new Plate(20);
            plate.info();
            for (int i = 0; i < allCats.length; i++) {
                if (allCats[i].satiety == false && allCats[i].appetite < plate.getFood()){
                    allCats[i].eat(plate);
                    allCats[i].satiety = true;
                    System.out.println("Котик " + allCats[i].name + " покушал!");
                } else {
                    System.out.println("Котик " + allCats[i].name + " не поел!");
                }
            }
            plate.info();
            System.out.println("Сколько грамм вискаса добавить еще в миску?");
            action = sc.nextInt();
            plate.increaseFood(action);
            plate.info();

        }
    }
