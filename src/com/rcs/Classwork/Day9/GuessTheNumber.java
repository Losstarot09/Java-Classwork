package com.rcs.Classwork.Day9;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        System.out.println("Uzdevums 7");
        int goalNumber = new Random().nextInt(10);

        do {
            System.out.print("Lūdzu, ievadiet veselo skaitļi no 0 līdz 9: ");
            Scanner read = new Scanner(System.in);
            int userNumber = read.nextInt();

            if (userNumber != goalNumber) {
                System.out.println("Nepareizi, meiģiniet velreizs!");
            } else {
                System.out.println("Pareizi!");
                read.close();
                break;
            }
        }
        while(true);
    }
}
