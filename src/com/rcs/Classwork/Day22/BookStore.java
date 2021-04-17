package com.rcs.Classwork.Day22;

import java.util.ArrayList;
import java.util.List;

public class BookStore {

    private Address address;
    private String phoneNumber;
    private List<StoreItem> storeItems;

    public BookStore(Address address, String phoneNumber) {
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.storeItems = new ArrayList<>();
    }

    public BookStore(Address address, String phoneNumber, List<StoreItem> storeItems) {
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.storeItems = storeItems;
    }

    public void addStoreItem(StoreItem item) {
        this.storeItems.add(item);
    }

    private String itemToString() {
        String value ="";
        for (StoreItem item : storeItems) {
            value += item.toString() + "\n";
        }
        return value;
    }

    public List<StoreItem> getStoreItems() { return this.storeItems; }

    @Override
    public String toString() {
        return String.format("Address: %s\nContact number: %s\nStore items:\n%s\n",
                address.toString(), phoneNumber, itemToString());
    }
}
