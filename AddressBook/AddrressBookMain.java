package com.AddressBook;

import java.util.Scanner;

public class AddrressBookMain {

    public static void main(String[] args) {
        ClassMethods obj = new ClassMethods();
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Address Book Program");
        while (true) {
            System.out.println("Select an Operation to perform \n 1. Add Contact\n 2. Display Object\n 3. Edit Existing contact\n 4.Delete Existing\n 5. Exit");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    obj.addContact();
                    break;
                case 2:
                    obj.displayContacts();
                    break;
                case 3:
                    obj.editContact();
                    break;
                case 4:
                    obj.deleteContact();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Enter Valid Choice");
            }
            scan.close();
        }
    }
}
