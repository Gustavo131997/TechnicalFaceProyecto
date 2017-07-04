/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componentes;   

  


import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;


/**
 *
 * @author Jonathan
 */
public class EncryptionMD5 {

    public static String MD5 = "MD5";

    public static String toHexadecimal(byte[] digest) {
        String hash = "";
        for (byte aux : digest) {
            int b = aux & 0xff;
            if (Integer.toHexString(b).length() == 1) hash += "0"; 
            hash += Integer.toHexString(b);
            
        }
        return hash;
    }

    public static String getStringMessageDigest(String message, String algorithm) {
        byte[] digest = null;
        byte[] buffer = message.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
            messageDigest.reset();
            messageDigest.update(buffer);
            digest = messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Error creando Digest");
        }
        return toHexadecimal(digest);
    }
    
    public static String Desencriptar(String encriptado){
        System.out.println(encriptado);
        String secretKey = "qualityinfosolutions"; //llave para encriptar datos
        String base64EncryptedString = "";
 
        try {
            System.out.println("h");
            byte[] message = Base64.decodeBase64(encriptado.getBytes("utf-8"));
            System.out.println("b");
            MessageDigest md = MessageDigest.getInstance("MD5");
            System.out.println("a");
            byte[] digestOfPassword = md.digest(secretKey.getBytes("utf-8"));
            System.out.println("c");
            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);
            System.out.println("g");
            SecretKey key = new SecretKeySpec(keyBytes, "DESede");
            System.out.println("w");
            Cipher decipher = Cipher.getInstance("DESede");
            System.out.println("t");
            decipher.init(Cipher.DECRYPT_MODE, key);
            System.out.println("r");
            System.out.println(message);
            byte[] plainText = decipher.doFinal(message);
            System.out.println(Arrays.toString(plainText));
            base64EncryptedString = new String(plainText, "UTF-8");
 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return base64EncryptedString;
    }
}
