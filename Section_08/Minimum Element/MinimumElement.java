import java.util.*;

public class MinimumElement {

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of elements:");
        int size = scanner.nextInt();

        return size;
    }

    private static int[] readElements(int size) {
        int[] userArray = new int[size];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements in an array: ");
        for (int i = 0; i < size; i++) {
            userArray[i] = scanner.nextInt();
        }
        scanner.close();
        return userArray;
    }

    private static int findMin(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int size = readInteger();
        int[] array = readElements(size);
        int minimum = findMin(array);
        System.out.println(minimum);
    }
}
