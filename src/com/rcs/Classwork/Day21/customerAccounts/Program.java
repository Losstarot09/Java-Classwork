package com.rcs.Classwork.Day21.customerAccounts;

import com.rcs.Classwork.Day21.customerAccounts.HelperClasses.AccountStorage;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Program {
    private final static String fileName = "Accounts";

    private static void displayAccount(List<Account> accounts){
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    public static void main(String[] args) {
        List<Account> accountList = AccountStorage.readFromFile(fileName);

        displayAccount(accountList);
        System.out.println("Veiciet kontu ievadi");
        Scanner read = new Scanner(System.in);
        int id = 1;
        if (accountList.size() > 0) {
            id = accountList.get(accountList.size() - 1).getId() + 1;
        }
        while (true) {
            System.out.println("IBAN: ");
            String IBAN = read.nextLine();
            System.out.println("Name: ");
            String name = read.nextLine();
            System.out.println("Surname: ");
            String surname = read.nextLine();
            System.out.println("Date of birth (YYYY-MM-DD): ");
            String date = read.nextLine();
            System.out.println("Balance: ");
            double balance = read.nextDouble();
            read.nextLine();

            Account account = new Account(id,IBAN,
                    new Customer(id, name, surname,LocalDate.parse(date)),
                    balance);
            accountList.add(account);
            id++;
            System.out.println("Turpināt? (Y/N)");
            String action = read.nextLine();
            if (action.equalsIgnoreCase("N")) {
                break;
            }
        }
        read.close();

        displayAccount(accountList);

        for (Account account : accountList) {
            account.deposit(10);
            account.withdraw(19.99);
            if (account.getId() == 1) {
                account.deposit(50);
            }
        }

        displayAccount(accountList);
        AccountStorage.saveToFile(accountList, fileName);
    }
}
