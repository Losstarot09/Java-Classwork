package com.rcs.Classwork.Day21.customerAccounts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        List<Account> accountList = new ArrayList<>();
        try {
            FileInputStream inputStream = new FileInputStream("accounts");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            //noinspection rawtypes
            accountList = (ArrayList)objectInputStream.readObject();
            inputStream.close();
            objectInputStream.close();


        } catch (Exception ex){
           // ex.printStackTrace();
        }

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

        for (Account account : accountList) {
            System.out.println(account);
        }

        try {
            FileOutputStream fileStream = new FileOutputStream("accounts");
            ObjectOutputStream objectStream = new ObjectOutputStream(fileStream);
            objectStream.writeObject(accountList);
            fileStream.close();
            objectStream.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        /*Customer klients1 = new Customer(1, "Kristabs", "Krumins",
                LocalDate.of(1995, 4, 1));*/
        /*System.out.println(klients.getId());
        System.out.println(klients.getName());
        System.out.println(klients.getSurname());
        System.out.println(klients.getDateOfBirth());
        System.out.println(klients.);*/
        /*Account konts1 = new Account(
                1,
                "LV84UNLA0000000001",
                klients1);

        Account konts2 = new Account(
                2,
                "LV84UNLA0000000002",
                new Customer(
                        2,
                        "Zane",
                        "Liepiņa",
                        LocalDate.of(1980, 1, 11)),
                110.10);
*/
        /*System.out.println(konts1);
        System.out.println(konts2);
        konts1.deposit(999.99);
        konts2.withdraw(100);
        System.out.println(konts1);
        System.out.println(konts2);
        klients1.setSurname("Kalniņš");
        System.out.println(konts1);*/
    }
}
