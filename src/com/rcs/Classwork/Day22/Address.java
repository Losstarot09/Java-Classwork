package com.rcs.Classwork.Day22;

public class Address {

    private String country;
    private String city;
    private String street;
    private int houseNr;

    public Address(String country, String city, String street, int houseNr) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNr = houseNr;
    }

    public String getCountry() { return this.country; }
    public String getCity() { return this.city; }
    public String getStreet() { return this.street; }
    public int getHouseNr() { return this.houseNr; }

    public void setCountry(String country) { this.country = country; }
    public void setCity(String city) { this.city = city; }
    public void setStreet(String street) { this.street = street; }
    public void setHouseNr(int houseNr) { this.houseNr = houseNr; }

    @Override
    public String toString() {
        return String.format("%s, %s, %s %d", country, city, street, houseNr);
    }
}
