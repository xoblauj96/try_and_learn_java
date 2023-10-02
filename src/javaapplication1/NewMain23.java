/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.time.Duration;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 *
 * @author stl_sdd_sor
 */
public class NewMain23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // TODO code application logic here
        final Duration timeout = Duration.ofSeconds(30);
ExecutorService executor = Executors.newSingleThreadExecutor();

final Future<String> handler = executor.submit(new Callable() {
    @Override
    public String call() throws Exception {
        return requestDataFromModem();
    }
});

try {
    handler.get(timeout.toMillis(), TimeUnit.MILLISECONDS);
} catch (TimeoutException e) {
    handler.cancel(true);
}

executor.shutdownNow();
    }
    
    
   public static String  requestDataFromModem(){
//       System.out.println("ok");
       return "Ok";
    }
}
