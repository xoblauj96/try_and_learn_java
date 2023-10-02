/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;

/**
 *
 * @author stl_sdd_sor
 */
public class NewMain6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add("1");
        ArrayList a1 =new ArrayList();
        if(a1.contains(arr.get(0))){
            System.out.println("if");
        }else{
            System.out.println("else");
        }
        System.out.println(arr);
        arr =null;
        if(arr != null){
            System.out.println("arr is not null");
        }else{
            System.out.println("arr is null");
        }
    }
    
}
