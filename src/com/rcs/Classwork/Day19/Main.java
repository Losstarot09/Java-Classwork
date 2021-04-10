package com.rcs.Classwork.Day19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Ievadi dienu (MONDAY-SUNDAY): ");
       // int dayNr = read.nextInt();
        String dayValue = read.nextLine();
        read.close();
       /* Day[] dayArray = Day.values();
        Day diena = dayArray[dayNr - 1];*/
        Day diena = Day.getDayLV(dayValue);
        System.out.println(diena);
        switch (diena) {
            case MONDAY:
                System.out.println("Pirmdiena");
                break;
            case FRIDAY:
                System.out.println("Piektdiena");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Nedēļas nogale");
                break;
            default:
                System.out.println("Nedēļas vidus");
        }
    }
}
