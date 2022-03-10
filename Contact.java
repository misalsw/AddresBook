package com.AddressBook;

public class Contact {

    String First_name;
    String Last_name;
    String Address;
    String City;
    String State;
    int Zip_code;
    int Phone_number;
    String Email;

    public Contact(String first_name, String last_name,
                   String address, String city, String state,
                   int zip_code, int phone_number, String email) {
        super();
        First_name = first_name;
        Last_name = last_name;
        Address = address;
        City = city;
        State = state;
        Zip_code = zip_code;
        Phone_number = phone_number;
        Email = email;

    }

    public String toString() {
        return String.format(First_name + " " + Last_name + " " + Address + " " + City + " " + State + " " + Zip_code + " " + Phone_number + " " + Email);
    }
}
