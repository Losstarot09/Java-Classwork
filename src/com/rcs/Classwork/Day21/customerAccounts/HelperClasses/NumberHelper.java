package com.rcs.Classwork.Day21.customerAccounts.HelperClasses;

public class NumberHelper {
    public static double round(double amount) {
        //noinspection IntegerDivisionInFloatingPointContext
        return Math.round(amount * 100) / 100;
    }
}
