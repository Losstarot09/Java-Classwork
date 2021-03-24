package com.rcs.Classwork.Day15;

import java.util.Scanner;

public class HelloUser {

    public static void sayHello(String text){
        System.out.printf("Hello, %s!\n", text);
    }

    public static void main(String[] args){
        System.out.println("Uzdevums 1");
        System.out.print("Lūdzu ievadiet sāvu vardu: ");
        Scanner read = new Scanner(System.in);
        String name = read.nextLine();
        sayHello(name);
    }
}
