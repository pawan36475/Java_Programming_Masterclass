import java.util.*;

public class ReverseArray {

    private static void reverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));

        int halfLength = array.length / 2;
        int lastIndex = array.length - 1;
        int temp;
        for (int i = 0; i < halfLength; i++) {
            temp = array[lastIndex - i];
            array[lastIndex - i] = array[i];
            array[i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        reverse(array);
    }
}
