/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
/**
 *
 * @author stl_sdd_sor
 */
public class DomParserDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            System.out.println(DomParserDemo.class.getResource("input.txt").getFile());
            File inputFile = new File(DomParserDemo.class.getResource("input.txt").getFile());
          
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document  doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println(doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("student");
            System.out.println(nList.getLength());
            for(int temp = 0 ; temp < nList.getLength();temp++){
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent "+nNode.getNodeName());
                if(nNode.getNodeType() == Node.ELEMENT_NODE){
                    Element element = (Element) nNode;
                    System.out.println("Roll No: "+element.getAttribute("rollno"));
                    System.out.println("first Name 1: "+element.getElementsByTagName("firstname").item(1).getTextContent());
                    System.out.println("first Name: "+element.getElementsByTagName("firstname").item(0).getTextContent());
                    System.out.println("last Name: "+element.getElementsByTagName("lastname").item(0).getTextContent());
                    System.out.println("nick Name: "+element.getElementsByTagName("nickname").item(0).getTextContent());
                    System.out.println("marks Name: "+element.getElementsByTagName("marks").item(0).getTextContent());
                    
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
