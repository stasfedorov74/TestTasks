package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введи строку А: ");
        String a = new java.util.Scanner(System.in).next();
        System.out.print("Введи строку Б: ");
        String b = new java.util.Scanner(System.in).next();
        System.out.println(a.equals(b) ? "Строки идентичны" : "Строки неидентичны");
    }
}