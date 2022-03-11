package com.AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassMethods {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Contact> contactbook = new ArrayList<>();

    public void addContact() {
        System.out.print("Enter First Name:- ");
        String first = input.next();

        System.out.print("Enter Last Name:- ");
        String last = input.next();

        System.out.print("Enter Address:- ");
        String add = input.next();

        System.out.print("Enter City:- ");
        String city = input.next();

        System.out.print("Enter State Name:- ");
        String state = input.next();

        System.out.print("Enter Zip Code:- ");
        int zip = input.nextInt();

        System.out.print("Enter Mobile Num:- ");
        long phone = input.nextLong();

        System.out.print("Enter E-mail:- ");
        String mail = input.next();

        System.out.println("\nContact added Suceessfully.");

    }

    public void displayContacts() {
        System.out.println("Contacts Present in Address Book: ");
        for (Contact person : contactbook) {
            System.out.println(person.toString());
        }
    }

    public void editContact() {
        System.out.println("Enter First name to Edit");
        String name = input.next();

        for (Contact person : contactbook) {
            if (name.equals(person.First_name)) {
                System.out.println("Select option to edit----\n1.First_name \n2.Last_name \n3.Address \n4.City \n5.State \n6.Zip_code \n7.Phone_number \n8.Email :- ");
                int option = input.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("Enter new first name :- ");
                        String newFirst_Name = input.next();
                        person.setFirst_name(newFirst_Name);
                        System.out.println("First name is Updated");
                        break;

                    case 2:
                        System.out.println("Enter new Last name :- ");
                        String newLastName = input.next();
                        person.setLast_name(newLastName);
                        System.out.println("Last name is Updated");
                        break;

                    case 3:
                        System.out.println("Enter new Address :- ");
                        String newAddress = input.next();
                        person.setAddress(newAddress);
                        System.out.println("Address is Updated");
                        break;

                    case 4:
                        System.out.println("Enter new City :- ");
                        String newCity = input.next();
                        person.setCity(newCity);
                        System.out.println("city is Updated");
                        break;

                    case 5:
                        System.out.println("Enter new State :- ");
                        String newState = input.next();
                        person.setState(newState);
                        System.out.println("State name is Updated");
                        break;

                    case 6:
                        System.out.print("Enter new zip code :- ");
                        int newZip = input.nextInt();
                        person.setZip_code(newZip);
                        System.out.println("New Zip is Updated");
                        break;

                    case 7:
                        System.out.println("Enter new Phone Number :- ");
                        int newPhone = input.nextInt();
                        person.setPhone_number(newPhone);
                        System.out.println("Phone Number is Updated");
                        break;

                    case 8:
                        System.out.println("Enter new E-mail :- ");
                        String newEmail = input.next();
                        person.setEmail(newEmail);
                        System.out.println("Email is Updated");
                        break;

                    default:
                        System.out.println("Please Enter a number between 1 to 8 only");

                }
            } else {
                continue;
            }

        }
    }

    public void deleteContact() {
        System.out.print("Enter first name to delete contact:- ");
        String name_to_delete = input.next();

        for(int i = 0; i < contactbook.size(); i++) {
            String search_name_in_arrayList = contactbook.get(i).getFirst_name();

            if(name_to_delete.equals(search_name_in_arrayList)) {
                contactbook.remove(i);
                System.out.println("\nEntered contact deleted successfully.");
                break;
            }
            else {
                continue;
            }
        }


    }


}
