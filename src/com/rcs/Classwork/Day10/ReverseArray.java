package com.rcs.Classwork.Day10;

import java.util.Arrays;
import java.util.Random;

public class ReverseArray {

    public static void main(String[] args) {
        System.out.println("Uzdevums 2");
        int[] numberArray =new int[10];
        Random rand = new Random();
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = rand.nextInt(10) + 1;
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
