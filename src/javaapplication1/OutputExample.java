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
import static java.awt.PageAttributes.MediaType.D;
import java.io.*;  
public class OutputExample {  
    public static void main(String[] args) throws IOException {  
        String pathFile=OutputExample.class.getResource("testout.txt").getFile();
        System.out.println(pathFile);
        FileOutputStream file = new FileOutputStream(pathFile);  
//        FileOutputStream file = new FileOutputStream("D:\\xob\\JavaApplication1\\src\\javaapplication1\\testout.txt");  
        DataOutputStream data = new DataOutputStream(file);  
//        data.writeInt(66);
//        data.writeInt(66);
//        data.writeInt(66);
//        data.writeInt(66);
        data.writeBytes("Hello world ....");
        data.flush();  
        data.close();  
        System.out.println("Succcess...");
        
        FileReader fr=new FileReader(pathFile);    
          BufferedReader br=new BufferedReader(fr);    
  
          int i;    
          while((i=br.read())!=-1){  
          System.out.println((char)i);  
          }  
          br.close();    
          fr.close();    
    }  
}  