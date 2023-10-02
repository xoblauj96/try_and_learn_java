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
public class NewMain7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String or = "02/16/2023 07:49:26 PM";
        String arr[] = or.split("/");
        or=arr[1]+"/"+arr[0]+"/"+arr[2];
        System.out.println(or);
    }
    
}
