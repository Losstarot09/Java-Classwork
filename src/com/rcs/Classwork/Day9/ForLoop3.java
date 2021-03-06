package com.rcs.Classwork.Day9;

import java.util.Scanner;

public class ForLoop3 {

    public static void main(String[] args) {
        System.out.println("Uzdevums 6");
        System.out.print("Lūdzu ievadiet veselo skaitļi, kas ir lielaks par 0: ");
        Scanner read = new Scanner(System.in);
        int number = read.nextInt();
        read.close();
        for (int i = 1; i <= number; i++) {
            System.out.printf("%d * %d = %d%n", number, i, number * i);
        }
    }
}
