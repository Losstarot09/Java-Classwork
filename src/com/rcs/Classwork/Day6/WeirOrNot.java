package com.rcs.Classwork.Day6;

import java.util.Scanner;

public class WeirOrNot {

    public static void main(String[] args) {
        System.out.println("Sveiki!");
        System.out.print("Lūdzu, ievadiet veselo skaitļi: ");
        Scanner read = new Scanner(System.in);
        int number = read.nextInt();
        read.close();

        if ((number % 2 != 0) || (number >= 6 && number <= 20)) {
            System.out.println("Dīvaini...");
        } else if ((number >= 2 && number <= 5) || number > 20) {
            System.out.println("Nav dīvaini");
        }
    }
}
