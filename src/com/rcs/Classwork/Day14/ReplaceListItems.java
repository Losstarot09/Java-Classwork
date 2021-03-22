package com.rcs.Classwork.Day14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ReplaceListItems {

    public static void main(String[] args) {
        System.out.println("Uzdevums 2");
        List<Integer> numberList = new ArrayList<>();
        Random rnd = new Random();
        int size = rnd.nextInt(16) + 5;

        for (int i = 0; i < size; i++) {
            numberList.add(rnd.nextInt(101));
            System.out.printf("%3d", numberList.get(i));
            if ( i != size - 1) {
                System.out.print("; ");
            } else {
                System.out.println();
            }
        }

        for (int i = 0; i < size; i++) {
            if (numberList.get(i) <= 39) {
                numberList.set(i, 0);
            }
            System.out.printf("%3d", numberList.get(i));
            if ( i != size - 1) {
                System.out.print("; ");
            } else {
                System.out.println();
            }
        }
    }
}
