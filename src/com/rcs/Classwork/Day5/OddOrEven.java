package com.rcs.Classwork.Day5;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        System.out.println("Uzdevums 2");
        System.out.print("Lūdzu, ievadiet skaitļi: ");
        Scanner read = new Scanner(System.in);
        Double number = read.nextDouble();
        read.close();

        if ( number % 2 == 0) {
            System.out.printf("Jūsu skaitlis %s ir pāra skaitlis%n", number);
        } else {
            System.out.printf("Jūsu skaitlis %s ir nepāra skaitlis%n", number);
        }
    }
}
