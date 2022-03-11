package com.AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassMethods {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Contact> contactbook = new ArrayList<>();

    public void addContact() {
        System.out.println("Enter First Name:- ");
        String first = input.next();

        System.out.println("Enter Last Name:- ");
        String last = input.next();

        System.out.println("Enter Address:- ");
        String add = input.next();

        System.out.println("Enter City:- ");
        String city = input.next();

        System.out.println("Enter State Name:- ");
        String state = input.next();

        System.out.println("Enter Zip Code:- ");
        int zip = input.nextInt();

        System.out.println("Enter Mobile Num:- ");
        double phone = input.nextLong();

        System.out.println("Enter E-mail:- ");
        String mail = input.next();

        System.out.print("Contact added Suceessfully.");

    }

    public void displayContacts() {
        System.out.println("Contacts Present in Address Book: ");
        for (Contact person : contactbook) {
            System.out.println(person.toString());
        }


    }
}
