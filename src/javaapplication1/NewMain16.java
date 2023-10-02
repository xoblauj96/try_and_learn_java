/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Optional;

/**
 *
 * @author stl_sdd_sor
 */
public class NewMain16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] str = new String[10];        
        str[5] = "JAVA OPTIONAL CLASS EXAMPLE";  // Setting value for 5th index  
        Optional<String> checkNull = Optional.ofNullable(str[5]);  
        checkNull.ifPresent(System.out::println);   // printing value by using method reference  
        System.out.println(checkNull.get().toLowerCase());    // printing value by using get method  
        System.out.println(str[5].toLowerCase());     
        
    }
    
}
