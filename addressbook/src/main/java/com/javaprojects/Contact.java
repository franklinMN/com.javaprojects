package com.javaprojects;

public class Contact {
    
    private String firstName;
    private String lastName;
    private String label;
    private String mobileNumber;

    public Contact(String firstName, String lastName, String label, String mobileNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.label = label;
        this.mobileNumber = mobileNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    
}
