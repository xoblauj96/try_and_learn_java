/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author stl_sdd_sor
 */
public class NewMain17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            System.out.println(getClientIP());
        } catch (UnknownHostException ex) {
            Logger.getLogger(NewMain17.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
     public static String getClientIP() throws UnknownHostException {
        String clientIP = "";
        try {
            final DatagramSocket socket = new DatagramSocket();
            socket.connect(InetAddress.getByName("8.8.80.8"), 10002);
            System.out.println(InetAddress.getAllByName(clientIP).toString());
            clientIP = socket.getLocalAddress().getHostAddress();
        } catch (SocketException | UnknownHostException e) {
            System.out.println("GET CLIENT IP ERROR:" + e.toString());
        }
        return clientIP;
    }
}
