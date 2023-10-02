/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author stl_sdd_sor
 */
public class NewMain14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String st = "a @ @ @";
String v1 = st.substring(0,1).replace("@","*");
String v2 = st.substring(st.length()-1,st.length()).replace("@","*");
String mid = st.substring(1,st.length()-1);

String newString = v1 + mid + v2;
        System.out.println("new: "+newString);
    }
    
}
