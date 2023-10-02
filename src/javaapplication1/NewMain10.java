/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author stl_sdd_sor
 */
public class NewMain10 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) throws ParseException {
        java.util.Date temp = new SimpleDateFormat("yyyy-MM-dd HH:mm") .parse("2012-07-10 14:58:00.000000");
        String pattern = "dd-MM-yyyy HH:mm";
SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
String date = simpleDateFormat.format(temp);
System.out.println(date);

    }
}
