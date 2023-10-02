/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import java.util.concurrent.ExecutionException;

/**
 *
 * @author stl_sdd_sor
 */
public class MainGuava {

    /**
     * @param args the command line arguments
     * @throws java.util.concurrent.ExecutionException
     */
    public static void main(String[] args) throws ExecutionException {
        // TODO code application logic here
        LoadingCache<String, Integer> cache = CacheBuilder.newBuilder().build(new CacheLoader<String, Integer>() {
            @Override
            public Integer load(String key) {
                return key.length();
            }
        });
        cache.put("hello",1);
        cache.put("hi", 2);
        System.out.println(cache.get("hello"));
        System.out.println(cache.get("hi"));
    }
    
}
