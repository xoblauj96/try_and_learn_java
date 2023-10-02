/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 *
 * @author stl_sdd_sor
 */
public class tryformatNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat formatter = new DecimalFormat("###,###");
//System.out.println(formatter.format(("1234567891234567891")));
//System.out.println(formatter.format(Integer.parseInt("")));

String[] province_id = "05,5".split(",");
        System.out.println(province_id[0]);
        System.out.println(province_id[1]);
        
        DecimalFormat formatNum = new DecimalFormat("#,##0");
        String output;
        BigDecimal bigDecimal = new BigDecimal("53715408017765341000222554465584");
        bigDecimal = bigDecimal.setScale(0);
        output = formatNum.format(bigDecimal);
        System.out.println(output);
    }
    
}
