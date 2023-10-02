/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import jxl.Sheet;
import jxl.Workbook;
import jxl.WorkbookSettings;

/**
 *
 * @author stl_sdd_sor
 */
public class ReadDataFromExcel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List list = null;
        try {
            File file = new File(NashornExample.class.getResource("Book2.xls").getFile());

            if ((file != null)) {
                WorkbookSettings settings = new WorkbookSettings();
                settings.setEncoding("Cp1252");
                Workbook workBook = Workbook.getWorkbook(file, settings);
                if (workBook != null) {
                    int sheetNum = workBook.getNumberOfSheets();
                    if (sheetNum > 0) {
                        Sheet sheet = workBook.getSheet(0);
                        System.out.println(sheet.getRows());
                        if (sheet != null) {
                            int totalRow = sheet.getRows();
//              ChangeSimForm row = null;
                            list = new ArrayList();

//              getClass();
                            for (int j = 0; j <= totalRow; j++) {
                                if (j >= totalRow + 1 - 1) {
                                    break;
                                }
                                int a = 1;
                                System.out.println(sheet.getCell(1, j).getContents().trim());
                                System.out.println(sheet.getCell(1 + a++, j).getContents().trim());
//                row = new ChangeSimForm();
//                getClass(); row.setIsdn(sheet.getCell(1, j).getContents().trim());
//                getClass(); row.setNewIsdn(sheet.getCell(1 + a++, j).getContents().trim());

//                getClass(); if (!"".equals(sheet.getCell(1, j).getContents().trim())) {
//                  list.add(row);
//                }
                            }
                        }
                    }
                }
            }
//      log.info("End get data from excel file.");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
//      log.error("Error: ", ex);
//      throw ex;
        }
    }

}
