package com.rcs.Classwork.Day8;

import java.util.Locale;
import java.util.Scanner;

public class WhileLoop2 {
    public static void main(String[] args) {
        System.out.println("Uzdevums 2");
        System.out.print("Lūdzu, ievadiet tekstu: ");
        Scanner read = new Scanner(System.in);
        String text = read.nextLine().trim();
        read.close();
        int i = 0;
        while (i < text.length()) {
            System.out.println(text.toUpperCase().charAt(i++));
        }
    }
}
