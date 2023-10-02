/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import com.sun.xml.internal.ws.client.RequestContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author stl_sdd_sor
 */
public class NewMain3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   ShowHeaders obj = new ShowHeaders();
//   obj.doGet(request, response);
   
    }
}



 class ShowHeaders extends HttpServlet {  
  
  public  void doGet(HttpServletRequest request,  
                    HttpServletResponse response)  
    throws IOException, ServletException {  
      response.setContentType("text/html");  
      PrintWriter out = response.getWriter();  
        
      out.println("HTTP headers sent by your client:<br>");  
        
    Enumeration enums = request.getHeaderNames();  
        while (enums.hasMoreElements()) {  
        String headerName = (String) enums.nextElement();  
        String headerValue = request.getHeader(headerName);  
        out.print("<b>"+headerName + "</b>: ");  
        out.println(headerValue + "<br>");  
      }  
        
  }  
}  