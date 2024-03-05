package com.javaprojects;

import java.util.Scanner;

public class AddressBookCLI {

    AddressBook addressBook;
    Contacts contact;
    
    static Scanner scanner;

    public static void main(String[] args){

        AddressBookCLI.initMethod();

    }

    private static void initMethod(){

        System.out.println("Welcome to AddressBookCLI Interface:");
        System.out.println("Press 1: To LOAD an existing workbook");
        System.out.println("Press 2: To CREATE an new workbook");


        scanner = new Scanner(System.in);

        int ch = scanner.nextInt();
        scanner.nextLine();

        if( ch == 1 ){

            AddressBook.showAllAddressBooks();
            System.out.println("Enter the address book name ( small case ) : ");
            String addressbookName = scanner.nextLine();
            scanner.nextLine();
            contactStorage.loadContacts(addressbookName);
        }
            
    }

    {

    }
    
}
