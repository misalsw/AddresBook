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
        this.First_name = first_name;
        this.Last_name = last_name;
        this.Address = address;
        this.City = city;
        this.State = state;
        this.Zip_code = zip_code;
        this.Phone_number = phone_number;
        this.Email = email;

    }

    public String getFirst_name() {
        return First_name;
    }

    public void setFirst_name(String first_name) {
        First_name = first_name;
    }

    public String getLast_name() {
        return Last_name;
    }

    public void setLast_name(String last_name) {
        Last_name = last_name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public int getZip_code() {
        return Zip_code;
    }

    public void setZip_code(int zip_code) {
        Zip_code = zip_code;
    }

    public int getPhone_number() {
        return Phone_number;
    }

    public void setPhone_number(int phone_number) {
        Phone_number = phone_number;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "First_name='" + First_name + '\'' +
                ", Last_name='" + Last_name + '\'' +
                ", Address='" + Address + '\'' +
                ", City='" + City + '\'' +
                ", State='" + State + '\'' +
                ", Zip_code=" + Zip_code +
                ", Phone_number=" + Phone_number +
                ", Email='" + Email + '\'' +
                '}';
    }
}
