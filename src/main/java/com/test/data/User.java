package com.test.data;

public class User {

    private String firstname;

    private String lastname;


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    public String toString() {
        String obj = "Username: " + "\nFirstname: " + this.firstname + "\nLastname: " + this.lastname;
        return obj;
    }
}