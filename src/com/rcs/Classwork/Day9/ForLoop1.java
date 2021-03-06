package com.rcs.Classwork.Day9;

public class ForLoop1 {

    public static void main(String[] args) {
        System.out.println("Uzdevums 4");
        int i = 0;
        int summa = 0;
        for ( ; i < 10; ) {
            System.out.println(++i);
            summa += i;
        }
        System.out.printf("Summa no 1 līdz %d ir %d%n", i, summa);
    }

}
