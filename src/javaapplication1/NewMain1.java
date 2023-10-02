/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author stl_sdd_sor
 */
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean check = false;
        String str = "209450->209499;2093250->2093399;209350->209399";
        String Input_num = "2094518422";

        String arrStr[] = str.split(";");
        int i = 0;
        for (i = 0; i < arrStr.length; i++) {
//            System.out.println(arrStr[i]);
            check = false;
            String a[] = arrStr[i].split("->");
//            System.out.println(a[0] + " <==> " + a[1]);
            long isdnCheck = Long.parseLong(Input_num.trim().substring(0, 6));
            long longStr1 = Long.parseLong(a[0].trim());
            long longStr2 = Long.parseLong(a[1].trim());
            if (i == 1) {
                isdnCheck = Long.parseLong(Input_num.trim().substring(0, 7));
            }

            if (isdnCheck >= longStr1 && isdnCheck <= longStr2) {
                System.out.println((i + 1) + ". Block isdn: " + Input_num);
                i += arrStr.length;
                check = true;
            } else {
                System.out.println(i + 1 + ". Passed....! check: " + check);
            }
        }
        System.out.println("i: " + i + "check: " + check);

    }

}
