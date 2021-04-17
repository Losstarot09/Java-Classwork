package com.rcs.Classwork.Day22;

import java.util.Arrays;

public class Book {

    private String name;
    private Author[] authors;

    public Book(String name, Author[] authors) {
        this.name = name;
        this.authors = authors;
    }

    public String getName() {
        return this.name;
    }

    public Author[] getAuthors() {
        return this.authors;
    }

    private String authorsToString() {
        String result = "";
        for (int i = 0; i < this.authors.length; i++) {
            result += this.authors[i].toString() + (i < this.authors.length - 1 ? ", " : "");
        }
        return  result;
    }

    @Override
    public String toString() {
        return String.format("Book: %s\nAuthors: %s", this.name, this.authorsToString());
    }
}
