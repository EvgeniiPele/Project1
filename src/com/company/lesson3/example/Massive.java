package com.company.lesson3.example;

import java.util.Arrays;

public class Massive {
    public static void main(String[] args) {
        trueSqaud();
    }

    public static void array() {
        int mass[] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == 1) {
                mass[i] = 0;
            } else mass[i] = 1;

        }

    }

    public static void mass() {
        int arr[] = new int[100];
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void foo() {
        int arr[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void squad() {
        int arr[][] = new int[4][4];
        int x = arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void trueSqaud() {
        int n = 4;
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            array[i][i] = 1;
            array[i][n - i - 1] = 1;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static int[] massive (int len, int initialValue) {
        int arr [] = new int [len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
    return arr;
    }
}

