package com.rcs.Classwork.Day22;

public abstract class StoreItem {
    protected double price;
    protected int quantity;

    StoreItem (double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public double getFullPrice() { return this.price; }

    public int getQuantity() {
        return this.quantity;
    }

    public void increaseQuantity(int count) {
        this.quantity += count;
    }

    public void decreaseQuantity(int count) {
        this.quantity -= count;
    }

    abstract double getPrice(boolean isClient);
}
