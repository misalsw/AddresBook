package com.AddressBook;

public class AddrressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        ClassMethods obj = new ClassMethods();
        obj.addContact();
        obj.displayContacts();

    }
}
