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

    public String getFirst_name() {
        return First_name;
    }

    public void setFirst_name(String first_name) {
        First_name = first_name;
    }

    public void setLast_name(String last_name) {
        Last_name = last_name;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setCity(String city) {
        City = city;
    }

    public void setState(String state) {
        State = state;
    }

    public void setZip_code(int zip_code) {
        Zip_code = zip_code;
    }

    public void setPhone_number(int phone_number) {
        Phone_number = phone_number;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getLast_name() {
        return Last_name;
    }

    public String getAddress() {
        return Address;
    }

    public String getCity() {
        return City;
    }

    public String getState() {
        return State;
    }

    public int getZip_code() {
        return Zip_code;
    }

    public int getPhone_number() {
        return Phone_number;
    }

    public String getEmail() {
        return Email;
    }

    public String toString() {
        return ("First name :"+First_name + "Last name :" + Last_name +
                "Address : " + Address + "City :" + City + "State : " + State + "Zip Code :" + Zip_code + "Mobile Num :" + Phone_number + "Mail Id: " + Email);
    }
}
