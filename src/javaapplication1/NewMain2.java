/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.net.InetAddress;

/**
 *
 * @author stl_sdd_sor
 */
public class NewMain2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            InetAddress myIP = InetAddress.getLocalHost();
            System.out.println(myIP);
        } catch (Exception e) {
        }
    }

}
