package com.JavaProgrammingMasterClass.demo;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    private static void reverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));
        int maxIndex = array.length - 1;
        int[] reversedArray = new int[array.length];
        for (int it : array) {
            reversedArray[maxIndex--] = it;
        }
        System.out.println("Reversed array = " + Arrays.toString(reversedArray));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ar = {1, 2, 3, 4, 5};
        reverse(ar);
    }
}

