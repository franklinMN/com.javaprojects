package com.javaprojects;

import java.util.List;

public interface ContactStorage {
    
    void saveContacts( List<Contacts> contacts, String fileName );
    List<Contacts> loadContacts( String fileName );

    public static void showAddressBooks(){
        
    }
}
