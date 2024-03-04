package com.javaprojects;

import java.nio.charset.StandardCharsets;
import java.security.spec.KeySpec;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;


public class AES {

    /* 1. Create private variables SALT and SECRET KEY
     * 2. Create static encrypt method
     * 3. Create static decrypt method
     */

     private static final String SECRET_KEY = "I_am_a_Secret_Key";
     private static final String SALT = "random_12356_salt";


     public static String encrypt( String strToEncrpString ){


        /* 1. Create an iv of 16 bytes
         * 2. Create a secret key with SecretKeyFactory, KeySpec, SecretKey, and SecretKeySpec classes
         * 3. Create an instance for Cipher class
         * 4. Run the init method with ENCRYPT_MODE
         * 5. return the ciper.doFinal() result in string format with Base64 class
         */

         try{

            byte[] iv = {
                0, 0, 0, 0,
                0, 0, 0, 0,
                0, 0, 0, 0,
                0, 0, 0, 0, };
            IvParameterSpec ivspec = new IvParameterSpec(iv);


            SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
            KeySpec spec = new PBEKeySpec(SECRET_KEY.toCharArray(), SALT.getBytes(), 65536, 256);
            SecretKey temp = factory.generateSecret(spec);
            SecretKeySpec secretKey = new SecretKeySpec( temp.getEncoded(), "AES" );

            Cipher cipher = Cipher.getInstance( "AES/CBC/PKCS5PADDING" );

            cipher.init(Cipher.ENCRYPT_MODE, secretKey, ivspec);

            return Base64.getEncoder().encodeToString(
                cipher.doFinal(strToEncrpString.getBytes(StandardCharsets.UTF_8))
             );

         }catch( Exception e ){

            e.printStackTrace();
         }

         return null;

     }

     public static String decrypt( String strToDecrypt ){

        /* 1. Create iv of 16 bytes
         * 2. Create a secret key with SecretKeyFactory, KeySpec, SecretKey, SecretKeySpec
         * 3. Create an instance of cipher class
         * 4. Run the init method in DECRYPT mode
         * 5. return the result in string format
         */

        try{

            byte[] iv = {
                0, 0, 0, 0,
                0, 0, 0, 0,
                0, 0, 0, 0,
                0, 0, 0, 0, };
            IvParameterSpec ivspec = new IvParameterSpec(iv);

            SecretKeyFactory factory = SecretKeyFactory.getInstance( "PBKDF2WithHmacSHA256" );
            KeySpec spec = new PBEKeySpec( SECRET_KEY.toCharArray(), SALT.getBytes(), 65536, 256 );
            SecretKey temp = factory.generateSecret(spec);
            SecretKeySpec secretKey = new SecretKeySpec(temp.getEncoded(), "AES");

            Cipher cipher = Cipher.getInstance( "AES/CBC/PKCS5PADDING" );

            cipher.init(Cipher.DECRYPT_MODE, secretKey, ivspec);

            return new String(
                cipher.doFinal(Base64.getDecoder().decode(strToDecrypt))
            );

        }catch( Exception e ){

            e.printStackTrace();

        }

        return null;

     }
    
}
