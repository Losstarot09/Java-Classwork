package com.rcs.Classwork.Day6;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        System.out.println("Uzdevums 3");
        int points = 0;
        Scanner read = new Scanner(System.in);
        System.out.print("Ievadi skaitļi: ");

        if (read.hasNextDouble()) {
            System.out.println(read.nextDouble());
            points++;
        }
        read.nextLine();

        System.out.print("Ievadi boolean: ");

        if (read.hasNextBoolean()) {
            System.out.println(read.nextBoolean());
            points++;
        }
        read.nextLine();

        System.out.print("Ievadi tekstu: ");

        if (read.hasNextLine()) {
            System.out.println(read.nextLine());
            points++;
        }

        read.close();

        System.out.println("Jūsu punktu skaits ir " + points);
    }
}
