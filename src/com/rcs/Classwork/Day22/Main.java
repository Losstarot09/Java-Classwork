package com.rcs.Classwork.Day22;

import java.time.LocalDate;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Book gramata1 = new Book("Mana gramata", new Author[]{
                new Author(
                        "Kristabs",
                        "Krumins"),
                new Author(
                        "Kristabs",
                        "Krumins",
                        Gender.MALE,
                        "Latvija"),
                new Author(
                        "Kristabs",
                        "Krumins",
                        Gender.MALE,
                        "Latvija",
                        LocalDate.of(2000, 1, 1))
        });
        BookItem bookItem1 = new BookItem(2.49, 10, gramata1);

        BookItem bookItem2 = new BookItem(
                10.99,
                23,
                new Book(
                        "Some Book",
                        new Author[]{
                                new Author(
                                        "Janis",
                                        "Berzins")
        }));

        BookStore BookStore1 = new BookStore(
                new Address(
                        "Latvija",
                        "Riga",
                        "Brivibas",
                        20),
                "29999999");
        BookStore1.addStoreItem(bookItem1);
        BookStore1.addStoreItem(bookItem2);
        BookStore1.addStoreItem(new NotebookItem(0.99, 80, "10x20 cm", 60, NotebookType.LINES));
        BookStore1.addStoreItem(new BookItem(50.99, 126, new Book(
                "Darga Gramata",
                new Author[]{
                        new Author(
                                "Vards",
                                "Uzvards",
                                Gender.UNKNOWN,
                                "Unknown")})));
        BookStore1.addStoreItem(new NotebookItem(1.20, 100, "20x40 cm", 48, NotebookType.RULED));
        System.out.println(BookStore1);

        Random  rnd = new Random();
        for (StoreItem item: BookStore1.getStoreItems()) {
            item.increaseQuantity(rnd.nextInt(10) + 1);
        }

        System.out.println(BookStore1);
    }
}
