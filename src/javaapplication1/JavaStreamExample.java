/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Optional;
import java.util.stream.Stream;

/**
 *
 * @author stl_sdd_sor
 */
public class JavaStreamExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Stream.iterate(1, element -> element+1).filter(el -> el % 5 ==0).limit(10).forEach(System.out::println);
//        System.out.println("----");
//        Stream.iterate(1, el -> el+1).filter(el -> el % 5 ==0).limit(5).forEach(System.out::println);
        String[] str = new String[10];
        Optional<String> checkNull = Optional.ofNullable(str[5]);
        System.out.println(checkNull.isPresent());
        System.out.println(checkNull);

        String lowercaseString = str[5].toLowerCase();
        System.out.print(lowercaseString);
    }

}
