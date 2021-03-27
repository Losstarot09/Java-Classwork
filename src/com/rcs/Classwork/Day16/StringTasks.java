package com.rcs.Classwork.Day16;

import com.rcs.Classwork.Day16Classes.StringUtils;

import java.util.Scanner;

public class StringTasks {

    public static void main(String[] args) {
        System.out.println("Uzdevums 1");
        System.out.print("Lūdzu, ievadiet tekstu: ");
        Scanner read = new Scanner(System.in);
        String text = read.nextLine();
        read.close();
        System.out.println("Teksta vidū ir: " + StringUtils.getMiddle(text));
        System.out.println("Uzdevums 2");
        System.out.println("Teksta reversā veida ir: " + StringUtils.getReverse(text));
    }
}
