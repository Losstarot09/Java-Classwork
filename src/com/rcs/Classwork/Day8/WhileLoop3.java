package com.rcs.Classwork.Day8;

import java.util.Scanner;

public class WhileLoop3 {
    public static void main(String[] args) {
        System.out.println("Uzdevums 3");
        System.out.print("Lūdzu ievadiet veselo skaitļi, kas ir lielaks par 0: ");
        Scanner read = new Scanner(System.in);
        int number = read.nextInt();
        read.close();
        int i = 0;
        while (i++ < number) {
            System.out.printf("%d * %d = %d%n", number, i, number * i);
        }
    }
}
