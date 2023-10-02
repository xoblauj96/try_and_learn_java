/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import static java.lang.System.*;
import java.util.concurrent.Callable;

/**
 *
 * @author stl_sdd_sor
 */
public class RollYourOwnTimeout implements Runnable {

    /**
     * @param args the command line arguments
     */
    private static final long MILLIS_TO_WAIT = 3100L;

    private static long timeExecute = 0L;
    private static long timeStart = 0L;
    private static long i = 1L;
    
    static RollYourOwnTimeout obj = new RollYourOwnTimeout();
     static   Thread thread = new Thread(obj);
//     static String a="result";
    public static void main(final String[] args) {
       String a="result";
        thread.start();
        System.out.println("This code is outside of the thread");
        timeStart = System.currentTimeMillis();

        final ExecutorService executor = Executors.newSingleThreadExecutor();
        // schedule the work
//        final Future<String> future = executor.submit(RollYourOwnTimeout::requestDataFromWebsite);
        final Future<String> future = executor.submit(new Callable(){
    public Object call() throws Exception {
        System.out.println("Asynchronous Callable");
        return requestDataFromWebsite(a);
    }
});

        try {
            System.out.println("Waiting.....");
            // where we wait for task to complete
            final String result = future.get(MILLIS_TO_WAIT, TimeUnit.MILLISECONDS);
            out.println("result: " + result);
        } catch (TimeoutException e) {
            err.println("task timed out " + e.getMessage());
            future.cancel(true /* mayInterruptIfRunning */);
        } catch (InterruptedException e) {
            err.println("task interrupted");
        } catch (ExecutionException e) {
            err.println("task aborted");
        }
        System.out.println("shutdown");
        executor.shutdownNow();
        timeExecute = System.currentTimeMillis() - timeStart;
        System.out.println(timeExecute);
        System.out.println("i:::"+i);
    }

    /**
     * dummy method to read some data from a website
     */
    private static String requestDataFromWebsite(String a) {
        int sum = 0;
        try {
            // force timeout to expire
            sum = 4 + 4;
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            System.out.println("===> " + e.getMessage());
        }
        System.out.println("success");
        return a+"dummy: " + sum;
    }

    @Override
    public void run() {
        
        boolean check =true;
        try {
            while (check) {
                System.out.println("This code is running in a thread" + (i++));
                if(i==10) { check =false; }
                
                
                Thread.sleep(1000);
            }
            System.out.println(i);
            thread.stop();
        } catch (Exception e) {
        }

    }

}
