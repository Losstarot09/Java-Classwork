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
            System.out.println(String.format("Jūsu skaitlis %s ir pāra skaitlis", String.valueOf(number)));
        } else {
            System.out.println(String.format("Jūsu skaitlis %s ir nepāra skaitlis", String.valueOf(number)));
        }
    }
}
