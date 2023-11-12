package org.example;

import org.example.classes.BinarySearch;
import org.example.classes.NightSky;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Task 1
        //int[] values = {6, 5, 8, 7, 11};
        //System.out.println("Smallest: " + smallest(values));
        // Task 2
        //System.out.println("Index of the smallest: " + indexOfTheSmallest(values));
        // Task 3
        // int[] values2 = {-1, 6, 9, 8, 12};
        //System.out.println(indexOfTheSmallestStartingFrom(values2, 1));
        //System.out.println(indexOfTheSmallestStartingFrom(values2, 2));
        //System.out.println(indexOfTheSmallestStartingFrom(values2, 4));

//        int[] values = {3, 2, 5, 4, 8};
//        System.out.println(Arrays.toString(values));
//
//        swap(values, 1, 0);
//        System.out.println(Arrays.toString(values));
//
//        swap(values, 0, 3);
//        System.out.println(Arrays.toString(values));

        // Task 5
//        int array[] = {-3, 2, 3, 4, 7, 8, 12};
//        Scanner reader = new Scanner(System.in);
//
//        System.out.println("Values of the array: " + Arrays.toString(array));
//        System.out.println();
//
//        System.out.print("Enter the searched number: ");
//        String searchedValue = reader.nextLine();
//        System.out.println();
//
//        boolean result = BinarySearch.search(array, Integer.parseInt(searchedValue));
//        if(result) {
//            System.out.println("Value " + searchedValue + " is in the array");
//        } else {
//            System.out.println("Value " + searchedValue + " is not in the array");
//        }

        // Task 6
//        int[] array = {5, 1, 3, 4, 2};
//        printElegantly(array);
    }

    public static int smallest(int[] array) {
        int min = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int indexOfTheSmallest(int[] array) {
        int min = array[0];
        int index = 0;
        for(int i = 1; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int min = array[index];
        int idx = index;
        for(int i = index; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
                idx = i;
            }
        }
        return idx;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void printElegantly(int[] array) {
        for(int i = 0; i < array.length; i++) {
            if(i != array.length-1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i] + " ");
            }
        }
    }
}