package com.rcs.Classwork.Day16;

public class MethodOverloading {

    public static int sum(int n1, int n2) {
        return n1 + n2;
    }

    public static int sum(int n1, int n2, int n3) {
        return sum(sum(n1, n2), n3);
    }

    public static float sum(float n1, float n2) {
        return n1 + n2;
    }

    public static float sum(float n1, float n2, float n3) {
        return sum(sum(n1, n2), n3);
    }

    public static void main(String[] args) {
        System.out.println("Uzdevums 4");
        int n1 = 1;
        int n2 = 2;
        int n3 = 3;
        float n1f = 0.1f;
        float n2f = 0.2f;
        float n3f = 0.3f;
        System.out.printf("x = %d, y = %d%n", n1, n2);
        System.out.printf("sum = %d%n", sum(n1, n2));
        System.out.printf("x = %d, y = %d, z = %d%n", n1, n2, n3);
        System.out.printf("sum = %d%n", sum(n1, n2, n3));
        System.out.printf("x = %.2f, y = %.2f%n", n1f, n2f);
        System.out.printf("sum = %.2f%n", sum(n1f, n2f));
        System.out.printf("x = %.2f, y = %.2f, z = %.2f%n", n1f, n2f, n3f);
        System.out.printf("sum = %.2f%n", sum(n1f, n2f, n3f));
    }
}
