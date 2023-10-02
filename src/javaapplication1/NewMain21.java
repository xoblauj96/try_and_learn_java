/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author stl_sdd_sor
 */
public class NewMain21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String words = "One Two Three Four";
int countWords = words.split("\\s").length;
System.out.println(countWords);
    }
    
}
