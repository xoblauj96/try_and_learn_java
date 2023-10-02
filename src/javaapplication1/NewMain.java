/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import sun.security.krb5.Config;
import sun.security.krb5.KrbException;
//import untils.Config;
//import java.utils.Config;

/**
 *
 * @author stl_sdd_sor
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws KrbException {
        File encryptModeFile = new File(File.separator + "encrypt.conf");
        System.out.println(encryptModeFile);

        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.SECOND, Integer.valueOf(1296000));
        SimpleDateFormat expireDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(expireDateFormat.format(cal.getTime()));
    }

}
