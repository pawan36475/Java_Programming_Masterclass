package com.JavaProgrammingMasterClass.demo;

import java.util.*;

public class MinimumElement {

    public static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of elements");
        int size = scanner.nextInt();

        return size;
    }

    public static int[] readElements(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] enteredElements = new int[size];
        for (int i = 0; i < size; i++) {
            enteredElements[i] = scanner.nextInt();
        }
        scanner.close();
        return enteredElements;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int myIntegerArray = readInteger();
        int[] enteredElements = readElements(myIntegerArray);
        int min = findMin(enteredElements);
        System.out.println("Minimum element is " + min);
    }
}

