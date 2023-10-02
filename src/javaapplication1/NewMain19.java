/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;

/**
 *
 * @author stl_sdd_sor
 */
public class NewMain19 {
 public static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(NewMain19.class);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try {
//            log.info("main start");
            // TODO code application logic here
//            URL url = new URL("http://10.120.53.10:8080/SqlReport?sql_code=report_form1&year=2023&month=4");
//            URLConnection urlc = url.openConnection();
//            urlc.setRequestProperty("Content-Type", "application/json");
//            Msj("Connectando: " + url.toString());
//
//            urlc.setDoOutput(true);
//            urlc.setAllowUserInteraction(false);
//            
//            PrintStream ps  =new PrintStream(urlc.getOutputStream());
//            ps.println();
//            ps.close();
//            
//            BufferedReader br = new BufferedReader(new InputStreamReader(urlc.getInputStream()));
//            String l = null;
//            while ((l=br.readLine())!=null) {
//                Msj(l);
//            }
//            br.close();
//            
String strURL ="http://10.120.53.10:8080/SqlReport?sql_code=report_form1&year=2023&month=4";
//   HttpClient httpclient = new HttpClient();
//            httpclient.getParams().setParameter("http.socket.timeout", 600);
//            httpclient.getParams().setParameter("http.connection.timeout", 600);
//
//            PostMethod post = new PostMethod(strURL);
//            GetMethod get = new GetMethod(strURL);
//            
//            RequestEntity entity = new StringRequestEntity(request, "text/xml", "UTF-8");
//            post.setRequestEntity(entity);
//            httpclient.executeMethod(post);
//
//            String responseBody = "";
//            responseBody = post.getResponseBodyAsString(6096000);
////            responseBody = post.getResponseBodyAsStream();
//            
//            System.out.println("Response: "+responseBody);
HttpClient client = new HttpClient();

    GetMethod method = new GetMethod(strURL);

//    try {
        int statusCode = client.executeMethod(method);

//        assertEquals("HTTP GET failed", HttpStatus.SC_OK, statusCode);

        String response = method.getResponseBodyAsString();
Msj(response);
//        assertTrue("Unexpected response body", response.contains("Simple Servlet ran successfully"));
//    } finally {
        method.releaseConnection();
//    }  
        } catch (Exception ex) {
          ex.printStackTrace();
        }
    }

    private static void Msj(String texto) {
        System.out.println(texto);
    }
}
