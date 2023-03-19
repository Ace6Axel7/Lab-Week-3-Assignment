/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labweek3assignment;
import java.util.Random;
/**
 *
 * @author Absalom
 */
public class NumberArray {
    protected int[] a;
    private int nElems;

    public NumberArray(int max) {
        a = new int[max];
        nElems = 0;
    }
    public void insert(int value) //Method to add elements in Array
    {
        a[nElems] = value;
        nElems++; 
    }
    
       public static int[] generateRandomArray(int size) //Method to generate random numbers
       {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
       }
    public void display() //Method to display all elements in array
    {
      for(int j=0; j<nElems; j++) 
      System.out.print(a[j] + ", ");
      System.out.println("");
    }
}
