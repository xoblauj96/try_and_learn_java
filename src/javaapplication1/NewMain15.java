/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

//import java.util.List;
import java.util.*;

/**
 *
 * @author stl_sdd_sor
 */
public class NewMain15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str="1,3,5";
        String strArr[] = str.split(",");
        System.out.println(strArr);
        List  lst = Arrays.asList(strArr);
        System.out.println(lst.contains("3"));
        
    }
    
}
