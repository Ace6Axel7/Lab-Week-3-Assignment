# Lab-Week-3-Assignment

Problem:

You are required to create a simple interactive application that asks the user to specify their desired size of the array for sorting purposes. The program then generates random numbers to fill the array to the specified size and sorts the input according to the user selected method (b) for bubble, (i) for insertion and (s) for selection sort. At the minimum, your program includes the following three methods:
1) A static method that takes an input array as an argument and sorts it in ascending order using bubble sort.
2) A static method that takes an input array as an argument and sorts it in descending order using selection sort.
3) A static method that takes an input array as an argument and sorts it in ascending order using insertion sort.
4) In addition, your program also needs to observe the amount of elapsed clock time it took to execute the sort, and print out that time. Java allows you can record the current time using the System.currentTimeMillis() method.

 Here's an example:
long startTime = System.currentTimeMillis();

// your method code goes here

long endTime = System.currentTimeMillis();
long executionTime = endTime - startTime;

Note: you need to record the time before you start executing the method, and then record the current time again after the method finishes executing. You then calculate the difference between the start and end times to get the execution time in milliseconds.
5) Generate arrays of varying sizes, starting with the size of 10 000 elements, 100 000 and 500 0000 and 1 000 0000 and 10 000 000 elements. For each, input size, sort the array using each of the three sorting algorithm and print the amount of time it took to execute the sort.
Make sure that you test your program to ensure that it correctly sorts an input array using all the three methods implemented above.
