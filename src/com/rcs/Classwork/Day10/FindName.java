package com.rcs.Classwork.Day10;

import java.util.Scanner;

public class FindName {

    public static void main(String[] args) {
        System.out.println("Uzdevums 1");
        String[] names = { "Kristaps", "Kristīne", "Līga", "Matīss", "Martiņš", "Jānis", "Ilze", "Sanita", "Sandijs" };
        Scanner read = new Scanner(System.in);
        System.out.print("Meklēt: ");
        String searchBy = read.nextLine();
        read.close();

        for (String name : names) {
            if (name.toUpperCase().startsWith(searchBy.trim().toUpperCase())) {
                System.out.println(name);
            }
        }
    }
}
