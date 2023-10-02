/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author stl_sdd_sor
 */


class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class LambdaExpressionExample11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Product> list=new ArrayList<Product>();  
        list.add(new Product(1,"Samsung A5",17000f));  
        list.add(new Product(3,"Iphone 6S",65000f));  
        list.add(new Product(2,"Sony Xperia",25000f));  
        list.add(new Product(4,"Nokia Lumia",15000f));  
        list.add(new Product(1,"Redmi4 ",26000f));  
        list.add(new Product(0,"ALenevo Vibe",19000f));  
          
        // using lambda to filter data  
//        Stream<Product> filtered_data = list.stream().filter(p -> p.price > 20000);  
//        Stream<Product> filter_data = list.stream().filter(p->p.price < 20000);
//        
//        filter_data.forEach((pro)->System.out.println(pro.name +"= "+pro.price));
          
        // using lambda to iterate through collection  
//        filtered_data.forEach(  
////                product -> System.out.println(product.name+": "+product.price)  
//        );  
//implementing lambda expression
 int i=0;
        Collections.sort(list, (p1,p2)->{
            System.out.println("p1: "+p1.id);
            System.out.println("p2: "+p2.id);
            System.out.println("compare: "+String.valueOf(p1.id).compareTo(String.valueOf(p2.id)));
        return String.valueOf(p1.id).compareTo(String.valueOf(p2.id));
        });
        
        for(Product p: list){
            System.out.println(p.id+" "+p.name+" "+p.price);
        }
    }
    
}
