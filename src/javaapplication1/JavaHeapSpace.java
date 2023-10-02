/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.concurrent.LinkedBlockingQueue;

/**
 *
 * @author stl_sdd_sor
 */
public class JavaHeapSpace {

    /**
     * @param args the command line arguments
     */
    // TODO code application logic here
    public static void main(String[] args) throws Exception {
//              String[] array = new String[100000 * 100000];
//              System.out.println(array);
//        long freeMemory = Runtime.getRuntime().freeMemory();
//        long totalMemory = Runtime.getRuntime().totalMemory();
//        long maxMemory = Runtime.getRuntime().maxMemory();
//
//        System.out.println("JVM freeMemory: " + freeMemory);
//        System.out.println("JVM totalMemory also equals to initial heap size of JVM : "
//                + totalMemory);
//        System.out.println("JVM maxMemory also equals to maximum heap size of JVM: "
//                + maxMemory);

//Read more: https://javarevisited.blogspot.com/2012/01/find-max-free-total-memory-in-java.html#ixzz7tM9xoPvn

   LinkedBlockingQueue<Integer> lbq
            = new LinkedBlockingQueue<Integer>();
  
        // add  numbers
        lbq.add(1);
        lbq.add(2);
        lbq.add(3);
        lbq.add(4);
        lbq.add(5);
  
        // print queue
        System.out.println("LinkedBlockingQueue:" + lbq);
    }

}
