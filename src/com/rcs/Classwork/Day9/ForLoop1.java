package com.rcs.Classwork.Day9;

public class ForLoop1 {

    public static void main(String[] args) {
        System.out.println("Uzdevums 4");
        int summa = 0;
        for (int i = 0 ; i <= 10; i++) {
            System.out.println(i);
            summa += i;
        }
        System.out.printf("Summa no 1 līdz 10 ir %d%n", summa);
    }

}
