/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.cache.RemovalListener;
import com.google.common.cache.RemovalNotification;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author stl_sdd_sor
 */
public class CacheEviction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LoadingCache<String, Integer> cache = CacheBuilder.newBuilder()
                .removalListener(new RemovalListener<String, Integer>() {
                    @Override
                    public void onRemoval(RemovalNotification<String, Integer> notification) {
                        System.out.println("Key - " + notification.getKey() + " removed due to " + notification.getCause());
                    }
                })
                .build(new CacheLoader<String, Integer>() {
                    @Override
                    public Integer load(String key) {
                        return key.length();
                    }
                });
    }

}
