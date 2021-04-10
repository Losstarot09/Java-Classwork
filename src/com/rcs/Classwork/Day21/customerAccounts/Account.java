package com.rcs.Classwork.Day21.customerAccounts;

import com.rcs.Classwork.Day21.customerAccounts.HelperClasses.NumberHelper;

import java.io.Serializable;

public class Account implements Serializable {
    private int id;
    private String IBAN;
    private double balance;
    private Customer customer;

    public Account(int id, String IBAN, Customer customer) {
        this.id = id;
        this.IBAN = IBAN;
        this.customer = customer;
        this.balance = 0;
    }

    public Account(int id, String IBAN, Customer customer, double balance) {
        this(id, IBAN, customer);
        if (balance > 0) {
            this.balance = balance;
        }
    }

    public int getId() {
        return this.id;
    }

    public String getIBAN() {
        return this.IBAN;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double amount) {
        this.balance = amount;
    }

    public String getCustomerName() {
        return String.format("%s %s\n", this.customer.getName(), this.customer.getSurname());
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (NumberHelper.round(amount) <= NumberHelper.round(this.balance)) {
            this.balance -= amount;
        } else {
            System.out.println("Nepietiekamais atlikums");
        }
    }

    @Override
    public String toString() {
        return String.format("id: %d\nCustomer: %s\nIBAN: %s\nBalance: %.2f",
                this.id, this.customer.toString(), this.IBAN, this.balance);
    }
}
