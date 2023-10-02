/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author stl_sdd_sor
 */
public class GetIp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        System.out.println(getIp());
    }

    private static String getIp() throws Exception{
//        try {
            InetAddress address = InetAddress.getLocalHost();
            String ip = address.getHostAddress();
            System.out.println(address.getCanonicalHostName());
            return ip;
//        } catch (UnknownHostException e) {
//            System.out.println(e.getMessage());
//            return "";
//        }
    }
}
