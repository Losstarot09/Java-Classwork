package com.rcs.Classwork.Day5;

import java.util.Scanner;

public class CheckPassFail {

    public static void main(String[] args) {
	    System.out.print("Lūdzu, ievadiet savu atzīmi (0-100): ");
        Scanner read = new Scanner(System.in);
        int mark = read.nextInt();
        read.close();

        if ( mark > 50) {
            System.out.print("PASS ");
        } else {
            System.out.print("FAIL ");
        }

        System.out.println("DONE");
    }
}
