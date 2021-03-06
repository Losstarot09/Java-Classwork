package com.rcs.Classwork.Day9;

import java.util.Scanner;

public class ForLoop2 {

    public static void main(String[] args) {
        System.out.println("Uzdevums 5");
        System.out.print("Lūdzu, ievadiet tekstu: ");
        Scanner read = new Scanner(System.in);
        String text = read.nextLine().trim();
        read.close();
        for (int i = 0; i < text.length(); i++){
            System.out.println(text.toUpperCase().charAt(i));
        }
    }
}
