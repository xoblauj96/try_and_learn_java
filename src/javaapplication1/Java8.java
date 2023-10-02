/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * @author stl_sdd_sor
 */
public class Java8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    List<Student> myList = new ArrayList<Student>();
    myList.add(new Student(1, "John", "John is a good Student"));
    myList.add(new Student(1, "Paul", "Paul is a good Player"));
    myList.add(new Student(1, "Tom", "Paul is a good Teacher"));

    System.out.println(myList);//old list
    myList = myList.stream().peek(obj -> obj.setBiography(null)).collect(Collectors.toList());
    System.out.println(myList);//new list
    }
    
}
