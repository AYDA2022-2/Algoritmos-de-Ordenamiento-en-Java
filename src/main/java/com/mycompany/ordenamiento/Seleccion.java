/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ordenamiento;

/**
 *
 * @author adriana ovallos
 */
public class Seleccion {
    
   //Ordenamiento por selección
    public static void seleccion(Integer[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = i; j < data.length; j++) {
                if (data[i] > data[j]) {
                    Integer aux = data[j];
                    data[j] = data[i];
                    data[i] = aux;
                }
            }
        }
    }

public static void main(String[] args) {
        Integer[] vals = {15, 60, 8, 16, 44, 27, 12, 35};
        Seleccion.seleccion(vals);
        for (Integer val : vals) {
            System.out.println(val);
        }
    }



}
    

