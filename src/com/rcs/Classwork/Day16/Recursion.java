package com.rcs.Classwork.Day16;

import java.util.Scanner;

public class Recursion {
    public static int factorial(int x) {
        return x > 1 ? x * factorial(x - 1) : 1;
    }

    public static void main(String[] args) {
        System.out.println("Uzdevums 5");
        Scanner read = new Scanner(System.in);
        int n;
        do {
            System.out.print("Lūdzu, ievadiet veselo skaitļi: ");
            n = read.nextInt();
        } while (n <= 0);
        read.close();
        System.out.printf("%d! = %d%n", n, factorial(n));
    }
}
