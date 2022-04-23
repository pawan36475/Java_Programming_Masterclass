import java.util.*;

public class SortedArray {


    public static int[] getIntegers(int size) {
        System.out.println("Enter " + size + " integer values.");
        int[] newArray = new int[size];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = scanner.nextInt();
        }
        scanner.close();
        return newArray;
    }

    public static int[] sortIntegers(int[] actualArray) {
        int[] sortedArray = new int[actualArray.length];
        for (int i = 0; i < actualArray.length; i++) {
            sortedArray[i] = actualArray[i];
        }

        boolean flag = true;
        while (flag) {
            flag = false;
            int temp;
            for (int i = 0; i < actualArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i + 1];
                    sortedArray[i + 1] = sortedArray[i];
                    sortedArray[i] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }


    public static void main(String[] args) {
        int[] myIntegersArray = getIntegers(6);
        int[] sortedArray = sortIntegers(myIntegersArray);
        printArray(sortedArray);
    }
}

