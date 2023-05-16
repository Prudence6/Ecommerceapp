package com.example.ecommerceapp;

public class Users {

    private int id;
    private String fullname;
    private String emailAddress;
    private String Passcode;
    private String DateOfBirth;
    private String PhoneNumber;

    public Users(int id, String fullname, String emailAddress, String passcode, String dateOfBirth, String phoneNumber) {
        this.id = id;
        this.fullname = fullname;
        this.emailAddress = emailAddress;
        Passcode = passcode;
        DateOfBirth = dateOfBirth;
        PhoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPasscode() {
        return Passcode;
    }

    public void setPasscode(String passcode) {
        Passcode = passcode;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
