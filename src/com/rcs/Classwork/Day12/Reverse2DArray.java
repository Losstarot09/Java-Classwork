package com.rcs.Classwork.Day12;

import java.util.Random;

public class Reverse2DArray {
    public static void main(String[] args) {
        Random rnd = new Random();
        int n = rnd.nextInt(5) + 2;
        int m = rnd.nextInt(5) + 2;
        int[][] array2D =new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array2D[i][j] = rnd.nextInt(101);
                System.out.printf("%4d ", array2D[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < (n / 2); i++) {
            int[] temp = array2D[i];
            array2D[i] = array2D[n - 1 - i];
            array2D[n - 1 - i] = temp;
        }
        System.out.println();

        for (int[] i : array2D) {
            for (int j : i) {
                System.out.printf("%4d ", j);
            }
            System.out.println();
        }
    }
}
