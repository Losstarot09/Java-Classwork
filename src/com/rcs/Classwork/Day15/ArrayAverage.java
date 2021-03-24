package com.rcs.Classwork.Day15;

import java.util.Arrays;
import java.util.Random;

public class ArrayAverage {


    public static int[] createArray(int size, int range){
        int[] list = new int[size];
        Random rnd = new Random();

        for (int i=0; i < list.length; i++){
            list[i] = rnd.nextInt(range) + 1;
        }
        return list;
    }

    public static float getAverage(int[] list) {
        int sum = 0;

        for (int j : list) {
            sum += j;
        }
        return(sum / (float)list.length);
    }

    public static void main(String[] args){
        System.out.println("Uzdevums 2");
        Random rnd = new Random();
        int size = rnd.nextInt(21) + 10;
        int range = rnd.nextInt(51) + 50;
        int[] numberList = createArray(size, range);
        System.out.println(Arrays.toString(numberList));
        System.out.printf("massīva vidēja vertība ir: %f\n", getAverage(numberList));
    }
}
