package com.javaprojects;

public interface ContactStorage {
    void saveContacts( Contact[] contacts );
    Contact[] loadContacts();
    void createNewAddressBook( String name );
}
