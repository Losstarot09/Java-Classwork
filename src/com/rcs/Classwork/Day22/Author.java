package com.rcs.Classwork.Day22;

import java.time.LocalDate;

public class Author {
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private Gender gender;
    private String country;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Author(String name, String surname, Gender gender, String country) {
        this(name, surname);
        this.gender = gender;
        this.country = country;
    }

    public Author(String name, String surname, Gender gender, String country, LocalDate dateOfBirth) {
        this(name, surname, gender, country);
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getCountry() {
        return this.country;
    }

    public Gender getGender() {
        return this.gender;
    }

    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    @Override
    public String toString() {
        return String.format("%s %s (%s)", this.name, this.surname,
                this.dateOfBirth != null ? this.dateOfBirth.toString() : "Nezinams");
    }
}
