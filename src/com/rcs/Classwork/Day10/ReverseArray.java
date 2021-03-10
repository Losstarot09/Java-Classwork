package com.rcs.Classwork.Day10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        System.out.println("Uzdevums 2");
        Scanner read = new Scanner(System.in);
        System.out.print("Lūdzu, ievadiet masīva izmeru: ");
        int size = read.nextInt();
        int[] numberArray =new int[size];
        Random rand = new Random();
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = rand.nextInt(31) + 20;
        }
        System.out.println(Arrays.toString(numberArray));
        for (int i = 0; i < (numberArray.length / 2); i++) {
            int temp = numberArray[i];
            numberArray[i] = numberArray[numberArray.length - 1 - i];
            numberArray[numberArray.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(numberArray));
    }
}
