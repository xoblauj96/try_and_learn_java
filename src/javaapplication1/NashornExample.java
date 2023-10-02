/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *
 * @author stl_sdd_sor
 */
public class NashornExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, ScriptException {
        // TODO code application logic here
//          // Creating script engine  
        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");  
//        // Reading Nashorn file  
////        ee.eval(new FileReader(NashornExample.class.getResource("hello.js").getFile()));  
//        ee.eval(new FileReader(System.getProperty("user.dir")+"\\hello.js"));  
//        System.out.println(System.getProperty("user.dir"));
ee.eval("print('Hello js Script')");

int[] arr = {5,8,1,0,6,9};

for(int i: arr){
    System.out.print(i+" ");
}
        System.out.println("");
        Arrays.parallelSort(arr, 0,1);
       for(int i: arr) System.out.print(i+" ");
    }
    
}
