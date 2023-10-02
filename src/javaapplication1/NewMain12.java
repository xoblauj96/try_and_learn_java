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
public class NewMain12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        String dateStr="2023-03-25 00:00";
        String dateStr="2023-03-25 00:00:05.123";
//        try {
//            System.out.println("hhhhh");
//              SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm");
//                Date dateStart = dateFormat.parse(dateStr);
//                System.out.println(dateStart.getTime());
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
        try {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
    Date parsedDate = dateFormat.parse(dateStr);
            System.out.println(parsedDate);
    Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
            System.out.println(timestamp);
} catch(Exception e) { //this generic but you can control another types of exception
    // look the origin of excption 
            System.out.println(e.getMessage());
}
    }
    
    
}
