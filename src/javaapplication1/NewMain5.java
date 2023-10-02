/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author stl_sdd_sor
 */
public class NewMain5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
//String joined = TextUtils.join(", ", list);
//String listStringS = String.join(", ", list);
//String listStringS = list.stream().map(Object::toString)
//                        .collect(Collectors.joining(", "));
        String listString = "";

        for (String s : list) {
            listString += s + ",";
        }

        System.out.println(listString.substring(0,listString.length() -1));
    }

}
