/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Arrays;

/**
 *
 * @author stl_sdd_sor
 */
public class Array3D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array[][][] = {
            {
                {3, 5, 8, 7},
                {5, 0, 7, 8},
                 {15, 10, 17,18}
            },
            {
                {2, 3, 6, 5},
                {5, 10, 8, 2}
            }
        };
        System.out.println("Array 3 Dimension = " + (Arrays.toString(array[0][0])));
        System.out.println("Array 3 Dimension value= " + ((array[0][2][0])));
    }

}
