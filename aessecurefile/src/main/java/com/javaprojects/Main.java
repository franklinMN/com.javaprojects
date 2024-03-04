package com.javaprojects;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        String stringToEString = "Franklin";

        String encryptedString = AES.encrypt(stringToEString);

        String decrypteString = AES.decrypt(encryptedString);

        System.out.println("Original String: " + stringToEString);
        System.out.println("Encrypted String: " + encryptedString);
        System.out.println("Decrypted String: " + decrypteString);
    }
}
