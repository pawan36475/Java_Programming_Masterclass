import java.util.*;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean hasNextInt;
        int count = 0;
        int numberValue = 0;
        int sum = 0;
        while (count < 10) {
            numberValue = count + 1;
            System.out.println("Enter number #" + numberValue + ":");
            hasNextInt = s.hasNextInt();
            if (hasNextInt) {
                int number = s.nextInt();
                sum = sum + number;
                count++;
                if (count == 10) {
                    break;
                }
            } else
                System.out.println("Invalid Number");

        }
        System.out.println("sum =" + sum);
        // s.close();
    }
}
