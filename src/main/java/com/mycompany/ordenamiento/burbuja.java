/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ordenamiento;

/**
 *
 * @author adriana ovallos
 */
public class burbuja {
    //Ordenamiento de burbuja
    public static void burbuja(Integer[] data) {
       
        for(int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - 1; j++) {
                if (data[j] > data[j + 1]) {
                    Integer temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }
    
  
    public static void main(String[] args) {
        Integer[] vals = {15, 60, 8, 16, 44, 27, 12, 35};
        burbuja.burbuja(vals);
        for (Integer val : vals) {
            System.out.println(val);
        }
    }
}
    


