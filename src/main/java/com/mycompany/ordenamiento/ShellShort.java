/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ordenamiento;

/**
 *
 * @author adriana ovallos
 */
public class ShellShort {
    
public static void intercambiar(int[] a, int i, int j)
{
int aux = a[i];
a[i] = a[j];
a[j]= aux ;
}
    
public static void ordenacionShell(int a[])
{
int intervalo, i, j, k;
Integer n= a.length;
intervalo = n / 2;
while (intervalo > 0){
for (i = intervalo; i < n; i++){
j = i - intervalo;
while (j >= 0){
k = j + intervalo;
if (a[j] <= a[k])
j = -1; // par de elementos ordenado
else{
intercambiar(a, j, j+1);
j -= intervalo;
}
}
}
intervalo = intervalo / 2;
}
}

public static void main(String[] args) {
    
        int [] vals = {15, 60, 8, 16, 44, 27, 12, 35};
        ShellShort.ordenacionShell(vals);
        for (Integer val : vals) {
            System.out.println(val);
        }
    }

    
}
