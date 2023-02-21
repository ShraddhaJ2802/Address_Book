package com.bridgelab.addressbook;

public class Person {

    private String fname;
    private String lname;
    private long phonenumber;
    private AddressBook address;

    private  String email;

    public long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public AddressBook getAddress() {
        return address;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email=email;
    }
    public void setAddress(AddressBook address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person [fname=" + fname + ", lname=" + lname + ", address="
                + address + " , Email=" +email + "]";
    }
}
