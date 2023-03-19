/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.labweek3assignment;

import java.util.Scanner;

/**
 *
 * @author Absalom
 */
public class LabWeek3Assignment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the maximum size of the array: "); //Prompting user to enter Array size
          int size = scanner.nextInt();
          
        NumberArray arr = new NumberArray(size);
        int[] randomArray = NumberArray.generateRandomArray(size); //Inserting random numbers into Array
        System.out.print("\nInserting random numbers into Array.... ");
        for (int i = 0; i < size; i++) {
            arr.insert(randomArray[i]);
        }
          
          System.out.println("\nArray before sorting:"); //Displaying Array before sorting it
          arr.display();
         
        { 
          System.out.println("\nEnter the sorting method:"   //Prompting user to choose any sorting algorithm
                  + " b for bubbleSort, i for insertionSort,"
                  + " s for selectionSort");
          
          char choice = scanner.next().charAt(0);
          long startTime = System.currentTimeMillis();
          switch(choice)
           {
              case 'b':
                  bubbleSort(arr.a);
              break;
              case 'i':
                  insertionSort(arr.a);
              break;
              case 's':
                  selectionSort(arr.a);
              break;
              
              default:
                  System.out.println("\nInvalid sort method selected.");
                  return;
           }
          
          long endTime = System.currentTimeMillis();
          long elapsedTime = endTime - startTime;  //Calculating amount of elapsed clock
                                                   //time it took to execute

          System.out.print("The new sorted array: "); //Displaying new sorted
          arr.display();
          System.out.println("Elapsed time: " + elapsedTime + "ms"); //Displaying elapsedTime
          scanner.close();
        }
    }
      public static void bubbleSort(int[] array) //A static method that takes an input array as an argument and sorts it in
                                                 //ascending order using bubble sort.
      {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] array) //A static method that takes an input array as an argument and sorts it in
                                                  //descending order using selection sort.
    {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = array[maxIndex];
            array[maxIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void insertionSort(int[] array) //A static method that takes an input array as an argument and sorts it in
                                                  //ascending order using insertion sort.
    {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
    /***************************TEST RESULTS********************************
    Sorting method  |10 000|100 000 |500 000  |1 000 000 |10 000 000       |
    *               |      |        |         |          |                 |
      bubbleSort    |203ms |21533ms |595667ms |2284544ms |OutOfMemorryError|
      insertionSort |24ms  |1237ms  |34811ms  |141710ms  |OutOfMemorryError|
      selectionSort |62ms  |5875ms  |145627ms |602370ms  |OutOfMemorryError|
    
    */
    
}
