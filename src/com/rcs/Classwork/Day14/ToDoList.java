package com.rcs.Classwork.Day14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoList {

    public static void main(String[] args) {

        List<String> toDoItems= new ArrayList<>();
        Scanner read = new Scanner(System.in);
        String item;

        do {
            System.out.print("Lūdzu, ievadiet lietu, kuru Jūms jāizdara (uzrakstiet exit, lai iziet): ");
            item = read.nextLine().toLowerCase().trim();

            if (!item.equals("exit")) {
                toDoItems.add(item);
            }
        } while (!item.equals("exit"));
        read.close();
        System.out.printf("Jūsu saraksta ir %d lietas!\n", toDoItems.size());

        for (int i = 0; i < toDoItems.size(); i++) {
            System.out.printf("To-Do item %2d: %s\n", i+1, toDoItems.get(i));
        }
    }
}
