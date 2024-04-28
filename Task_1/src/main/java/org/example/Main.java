package org.example;

import java.util.Scanner;

public  class Main {
    public static void main(String[] args) {
        ComparisonAB comparisonAB = new ComparisonAB();
        System.out.println("Введи A: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int A = scanner.nextInt();
            System.out.println("Введи B: ");
            if (scanner.hasNextInt()) {
                int B = scanner.nextInt();
                comparisonAB.Compare(A, B);
            }
            else {
                System.out.println("Вы ввели не число");
            }
        } else {
            System.out.println("Вы ввели не число");
        }


    }
    static class ComparisonAB {


        public void Compare(int A, int B) {
            if (A > B) {
                System.out.println("A > B");
            } else if (A < B) {
                System.out.println("A < B");
            } else {
                System.out.println("A = B");
            }
        }
    }
}