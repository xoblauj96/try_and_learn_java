/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author stl_sdd_sor
 */
public class NewMain13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       	
    	//Displaying given time in 12 hour format with AM/PM
//    	String dateString3 = "00.30"; 
//    	//old format
//    	SimpleDateFormat sdf = new SimpleDateFormat("HH.mm");
//    	try{
//    	Date date3 = sdf.parse(dateString3);
//    	//new format
//    	SimpleDateFormat sdf2 = new SimpleDateFormat("hh.mm aa");
//    	//formatting the given time to new format with AM/PM
//    	System.out.println("Given time in AM/PM: "+sdf2.format(date3));
//    	}catch(ParseException e){
//    		e.printStackTrace();
//    	}
    	
    	//Displaying given time in 12 hour format with AM/PM
//    	String dateString4 = "21/12/2016 12:20"; 
//    	//old format
//    	SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm");
//    	try{
//    	Date date4 = sdf3.parse(dateString4);
//    	//new format
//    	SimpleDateFormat sdf4 = new SimpleDateFormat("dd/MM/yyyy hh:mm aa");
//    	//formatting the given time to new format with AM/PM
//    	System.out.println(sdf4.format(date4));
//        Date d = sdf4.parse(sdf4.format(date4));
//                    System.out.println(d.getTime());
//    	}catch(ParseException e){
//    		e.printStackTrace();
//    	}
        
        
            try {
             String dateString4 = "2023-03-25 12:00";
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            Date date4 = sdf3.parse(dateString4);
            //new format
            SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm aa");
            //formatting the given time to new format with AM/PM
            System.out.println(sdf4.format(date4));
            Date d = sdf4.parse(sdf4.format(date4));
            System.out.println(d.getTime());
                Timestamp timestamp = new java.sql.Timestamp(d.getTime());
            System.out.println(timestamp);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        
    }
}
