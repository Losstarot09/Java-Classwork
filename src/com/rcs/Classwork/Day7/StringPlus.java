package com.rcs.Classwork.Day7;

import java.util.Scanner;

public class StringPlus {

    public static void main(String[] args) {
        System.out.println("Uzdevums 1");
        System.out.print("Lūdzu, ievadiet pirmo tekstu: ");
        Scanner read = new Scanner(System.in);
        String text1 = read.nextLine().trim();
        System.out.print("Lūdzu, ievadiet otro tekstu: ");
        String text2 = read.nextLine().trim();
        read.close();
        System.out.println(text1.length() >= text2.length() ? text2 + text1.toUpperCase() + text2 :
                text1 + text2.toUpperCase() + text1);
    }
}
