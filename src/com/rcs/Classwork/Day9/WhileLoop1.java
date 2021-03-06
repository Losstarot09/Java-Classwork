package com.rcs.Classwork.Day9;

public class WhileLoop1 {

    public static void main(String[] args) {
        System.out.println("Uzdevums 1");
        int i = 0;
        int summa = 0;
        do {
            System.out.println(++i);
            summa += i;
            System.out.printf("Summa no 1 līdz %d ir %d%n", i, summa);

        } while (i < 10);
    }
}
