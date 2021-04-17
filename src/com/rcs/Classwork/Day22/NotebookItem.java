package com.rcs.Classwork.Day22;

public class NotebookItem extends StoreItem{

    private int pageCount;
    private String format;
    private NotebookType type;

    public NotebookItem(double price, int quantity, String format, int pageCount, NotebookType type) {
        super(price, quantity);
        this.format = format;
        this.pageCount = pageCount;
        this.type = type;
    }

    @Override
    double getPrice(boolean isClient) {
        return this.price * (isClient ? 0.6 : 1);
    }

    @Override
    public String toString() {
        return String.format("Notebook\nformat: %s\nPage count: %d\nType: %s\nPrice: %.2f\nQuantity: %d\n",
                format, pageCount, type, price, quantity);
    }
}
