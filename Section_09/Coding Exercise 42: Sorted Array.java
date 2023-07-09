package com.JavaProgrammingMasterClass.demo;

import java.util.*;

public class SortedArray {

    public static int[] getIntegers(int size) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + size + " integer values.");
        int[] newArray = new int[size];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = scanner.nextInt();
        }
        scanner.close();
        return newArray;
    }

    public static int[] sortIntegers(int[] actualArray) {
        int[] sortedArrays = Arrays.copyOf(actualArray, actualArray.length);
        for (int i = 0; i < sortedArrays.length; i++) {
            sortedArrays[i] = actualArray[i];
        }
        boolean flag = true;
        while (flag) {
            flag = false;
            int temp;
            for (int i = 0; i < sortedArrays.length-1; i++) {
                if (sortedArrays[i] < sortedArrays[i + 1]) {
                    temp = sortedArrays[i + 1];
                    sortedArrays[i + 1] = sortedArrays[i];
                    sortedArrays[i] = temp;
                    flag = true;
                }
            }
        }
        return sortedArrays;
    }

    public static void printArray(int[] sortedArray) {
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println("Element " + i + " contents " + sortedArray[i]);
        }
    }

    public static void main(String[] args) {
        int[] myIntegerArray = getIntegers(6);
        int[] sortedArray = sortIntegers(myIntegerArray);
        printArray(sortedArray);
    }
}
