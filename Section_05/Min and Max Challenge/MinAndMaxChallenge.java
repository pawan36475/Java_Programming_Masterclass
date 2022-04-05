import java.util.*;

public class MinAndMaxChallenge {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        boolean first = true;

        while (true) {
            System.out.println("Enter number:");
            boolean isAnInt = s.hasNextInt();

            if (isAnInt) {
                int number = s.nextInt();
                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } else {
                break;
            }
            s.nextLine();
        }

        System.out.println("min= " + min + ",max= " + max);
    }
}
