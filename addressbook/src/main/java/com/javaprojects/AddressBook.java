package com.javaprojects;

import java.util.ArrayList;
import java.util.List;

/* AddressBook class provides CRUD operations and maintains the contact list
 * 1. Arraylist - to store the contacts
 * 2. addContact - creats a new contact
 * 3. updateContact - updates an exsisting contact
 * 4. readAllContact - displays all the contact information
 * 5. 
 * 6. deleteAllContacts - deletes all the Contacts
 * 7. deleteAContact - deletes a contact
 * 8. loadContactsFromFile - reads all the contacts to file
 * 9. saveContactsToFile - saves all the contacts to file
 */

public class AddressBook {

    private List<Contacts> contacts;
    private ContactStorage contactStorage;

    public AddressBook(ContactStorage contactStorage){

        contacts = new ArrayList<>();
        this.contactStorage = contactStorage;
    }

    public void addContact( Contacts contact ){
        contacts.add(contact);
    }

    public void updateContact( Contacts contact ){

    }

    public List<Contacts> readAllContact(){
        return contacts;
    }

    public void deleteContactByName( String name ){

    }

    public void deleteAllContacts(){

    }

    // public Contacts readAContact() {

    // }

    public void saveContactsToFile( List<Contacts> contacts, String fileName ){
        contactStorage.saveContacts(contacts, fileName);
    }

    public void loadContactsFromFile( String fileName ){
        contacts = contactStorage.loadContacts(fileName);
    }

    public static void showAllAddressBooks(){
        ContactStorage.showAddressBooks();
    }
    
}
