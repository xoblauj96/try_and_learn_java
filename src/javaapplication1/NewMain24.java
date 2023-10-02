/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author stl_sdd_sor
 */
public class NewMain24 {

    private static String cardFormat = "\\d+";
    /**
     * @param args the command line arguments
     */
    protected static LinkedList queueData = new LinkedList();
    private static HashMap<String, String> configMap;
    private static List lstKey = new ArrayList();
    public static void main(String[] args) {
        // TODO code application logic here
//        queueData.add("hello ");
//        queueData.add("world");
//        queueData.add("123");
//        String rs = queueData.remove().toString();
//        System.out.println(rs);
        parseConfigMap();
        for (int i = 0; i < lstKey.size(); i++) {
            System.out.println(configMap.get(lstKey.get(i).toString().toUpperCase()));
        }
        
    }

 synchronized private static void parseConfigMap() {
        if (configMap != null) {
            return;
        }
//        logger.info("Reading config file");
        configMap = new HashMap<String, String>();
        try {
            FileInputStream fis = new FileInputStream(NashornExample.class.getResource("input1.txt").getFile());
            String line = "";
            int r;
            while ((r = fis.read()) != -1) {
                line += (char) r;
                if (r == 10) {
                    if (!line.equals("")) {
                        line = line.trim();
                        if (line.indexOf("=") != -1) {
//                            logger.info("Line: "+line);
                            if(!line.startsWith("#") || !line.contains("#")){
                            String key = line.substring(0, line.indexOf("="));
                            lstKey.add(key);
                            String val = "";
                            
                            if (line.indexOf("=") + 1 < line.length()) {
                                val = line.substring(line.indexOf("=") + 1);
                            }
                            configMap.put(key.toUpperCase().trim(), val.trim());
                            }
                        }
                    }
                    line = "";
                }
            }
            if (!line.equals("") && line.indexOf("=") != -1) {
//                logger.info("Line: "+line);
                String key = line.substring(0, line.indexOf("="));
                String val = "";
                if (line.indexOf("=") + 1 < line.length()) {
                    val = line.substring(line.indexOf("=") + 1);
                }
                configMap.put(key.toUpperCase().trim(), val.trim());
            }
            fis.close();
        } catch (Exception e) {
//            logger.error("Error when read File Config: " + Constant.CONFIG_FILE + ": " + e.toString(), e);
            configMap = null;
        }
    }
}
