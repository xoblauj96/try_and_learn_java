/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 *
 * @author stl_sdd_sor
 */
public class TryFormatNumberDecemal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String s   = setThousandSeparate("1111.3");
//     String s   = setThousandSeparate("0.03704035874439462");

        System.out.println(s);
    }

    public static String setThousandSeparate(String str) {
        DecimalFormat formatter = new DecimalFormat("#,###");
        String output = "0";
        String rounding = "";
        if (str != null && !str.equals("")) {
            if (str.contains(".")) {
                String arrStr[] = str.split("\\.");
                str = arrStr[0];
                rounding = "." + arrStr[1];
            }
            BigDecimal bigDecimal = new BigDecimal(str);
            bigDecimal = bigDecimal.setScale(0);
            output = formatter.format(bigDecimal);
        }
        return output + rounding;
    }
}
