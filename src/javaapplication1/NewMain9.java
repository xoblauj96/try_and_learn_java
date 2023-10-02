/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author stl_sdd_sor
 */
public class NewMain9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try {
           final String text = "2023-03-19 15:39";
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm");
    Date parsedDate = dateFormat.parse(text);
    Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
           System.out.println(parsedDate.getTime());
           
           System.out.println("103".substring(0, 1));
} catch(Exception e) { //this generic but you can control another types of exception
    // look the origin of excption 
}
    }
    
}
