/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mejluj;

/**
 *
 * @author stl_sdd_sor
 */
public class __Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DbProcessorAbstract db;
        db = new DbProcessorAbstract() {
            @Override
            public int sum() {
                return 1+2;
            }
        };
    }
    
}
