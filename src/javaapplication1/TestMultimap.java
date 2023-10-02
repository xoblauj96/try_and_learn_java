/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.MultimapBuilder;

/**
 *
 * @author stl_sdd_sor
 */
public class TestMultimap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListMultimap<String,Integer> m = MultimapBuilder.hashKeys().linkedListValues().build();
//        ListMultimap<String, Integer> m = ArrayListMultimap.create();
        m.get("age").add(29);
        m.get("age").add(28);
        m.get("age").add(27);
        m.put("age", 26);
        m.put("name", 44);
        m.get("age").remove("age");
        System.out.println(m.get("name"));
        
        ListMultimap<Integer, String> map = MultimapBuilder.hashKeys().linkedListValues().build();
        
        map.get(1).add("Sor");
        map.get(1).add("xob");
        map.remove(1, "Sor");
        map.get(2).add("Lor");
        System.out.println(map.get(1));
        System.out.println(map.get(2));
    }
    
}
