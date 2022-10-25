/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ordenamiento;

/**
 *
 * @author adriana ovallos
 */
public class Insercion {
   
    //Ordenamiento por inserción
    public static void insercion(Integer[] data) {
        for (int i = 1; i < data.length; i++) {
            Integer aux = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > aux) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = aux;
        }
    }



    public static void main(String[] args) {
        Integer[] vals = {15, 60, 8, 16, 44, 27, 12, 35};
        Insercion.insercion(vals);        
        for (Integer val : vals) {
            System.out.println(val);
        }
    }
}   


