package com.javaprojects;

public class Contacts {

    private String firstName;
    private String lastName;
    private String gmailID;
    private String contactNumber;
    private String label;

    public Contacts( String firstName, String lastName, String gmailID, String contactNumber, String label ){

        this.firstName = firstName;
        this.lastName = lastName;
        this.gmailID = gmailID;
        this.contactNumber = contactNumber;
        this.label = label;
    }
    
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
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
    public String getGmailID() {
        return gmailID;
    }
    public void setGmailID(String gmailID) {
        this.gmailID = gmailID;
    }
    public String getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "Contacts [firstName=" + firstName + ", lastName=" + lastName + ", gmailID=" + gmailID
                + ", contactNumber=" + contactNumber + ", label=" + label + "]";
    }

    
    
}
