package com.rcs.Classwork.Day6;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Uzdevums 2");
        System.out.println("Šājā programma Jūs ievadisiet divus skaitļus (a; b) un aretmitisko " +
                "darbību (!) formātā a ! b");
        System.out.print("Lūdzu, ievadiet pirmo skaitļi a: ");
        Scanner read = new Scanner(System.in);
        float a = read.nextFloat();
        System.out.print("Lūdzu, ievadiet pirmo skaitļi b: ");
        float b = read.nextFloat();
        read.nextLine();
        System.out.print("Lūdzu, ievadiet aretmitisko darbību (+; -; *; /): ");
        String action = read.nextLine();
        read.close();

        switch (action) {
            case "+":
                System.out.printf("%s %s %s = %s %n", a, action, b, a +b);
                break;
            case "-":
                System.out.printf("%s %s %s = %s %n", a, action, b, a - b);
                break;
            case "*":
                System.out.printf("%s %s %s = %s %n", a, action, b, a * b);
                break;
            case "/":
                System.out.printf("%s %s %s = %s %n", a, action, b, a / b);
                break;
            default:
                System.out.println("Nepareizais aritmetiskais operators");
        }
    }
}
