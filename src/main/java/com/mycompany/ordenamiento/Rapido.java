/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ordenamiento;

/**
 *
 * @author adriana ovallos
 */
public class Rapido {
    
public static void intercambiar(int[] a, int i, int j)
{
int aux = a[i];
a[i] = a[j];
a[j]= aux ;
}
       
public static void quicksort(int a[])
{
quicksort(a, 0, a.length-1);
}
private static void quicksort(int a[], int primero, int ultimo)
{
int i, j, central;
double pivote;
central = (primero + ultimo)/2;
pivote = a[central];
i = primero;
j = ultimo;
do {
while (a[i] < pivote) i++;
while (a[j] > pivote) j--;
if (i <= j)
{
intercambiar(a, i, j);
i++;
j--;
}
}while (i <= j);
if (primero < j)
quicksort(a, primero, j); // mismo proceso con sublista izqda
if (i < ultimo)
quicksort(a, i, ultimo); // mismo proceso con sublista drcha

}
    
public static void main(String[] args) {
        int [] vals = {15, 60, 8, 16, 44, 27, 12, 35};
        Rapido.quicksort(vals);
        for (Integer val : vals) {
            System.out.println(val);
        }
    }
    
}
