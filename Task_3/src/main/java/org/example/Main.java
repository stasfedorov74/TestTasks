package org.example;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Заданный массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" "+array[i]);
        }
        System.out.println();
        System.out.print("Массив с четными числами: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(" "+array[i]);
            }
        }
    }
}