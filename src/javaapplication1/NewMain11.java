/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Arrays;

/**
 *
 * @author stl_sdd_sor
 */
public class NewMain11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str ="no, yes, good, very, good, not good, thank you, pretty good, don't like, ດີຫລາຍແລ້ວ, ຂໍຂອບໃຈ, ພໍໃຈຫລາຍ ແລ້ວ,  thanks so much,  ok very good";
        String str1 = str.replace(",", "\n");
        System.out.println(str1);
        String arrStr[] = str.split(",");
        System.out.println(Arrays.toString(arrStr));
        for(String s: arrStr){
            
            System.out.println(s);
        }
        String string=" ";
        for (int i = 0; i < arrStr.length; i++) {
             string += (i+1) +""+arrStr[i]+".  ";
            
        }
        System.out.println(string);
    }
    
}
