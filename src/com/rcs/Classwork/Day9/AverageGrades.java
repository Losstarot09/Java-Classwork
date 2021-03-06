package com.rcs.Classwork.Day9;

import java.util.Random;

public class AverageGrades {

    public static void main(String[] args) {
        System.out.println("Uzdevums 8");
        int[] grades = new int[8];
        int sum = 0;

        for (int i = 0; i < grades.length; i++) {
            grades[i] = new Random().nextInt(7) + 4;
            System.out.printf("Atzīme Nr. %d: %d%n", i + 1, grades[i]);
            sum += grades[i];
        }

        float average = (float)sum / grades.length;
        System.out.printf("Vīdeja atzīme: %.2f%n", average);
    }
}
