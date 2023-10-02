/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.security.MessageDigest;
import java.util.concurrent.ConcurrentHashMap;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 *
 * @author stl_sdd_sor
 */
public class __ConcurrentHashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        // Adding elements to the map
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        System.out.println("Map size: " + map.size());

        // Getting values from the map
        int valueA = map.get("A");
        System.out.println("Value of A: " + valueA);

        // Removing elements from the map
        map.remove("B");
        map.remove("C");
        System.out.println("Map size: " + map.size());

        try {
            MessageDigest md = null;
            md = MessageDigest.getInstance("SHA-1");
            md.update("123".getBytes("UTF-8"));
            byte[] raw = md.digest();
            System.out.println(raw);
            String hash = new BASE64Encoder().encode(raw);
            System.out.println("hash-->" + hash);
            byte[] decodedBytes = new BASE64Decoder().decodeBuffer(hash);
            String decodedString = new String(decodedBytes);
            System.out.println(decodedString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String encrypt(String plaintext)
            throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        md.update(plaintext.getBytes("UTF-8"));
        byte[] raw = md.digest();
        String hash = new BASE64Encoder().encode(raw);
        return hash;
    }
}
