import java.util.*;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner s = new Scanner(System.in);
        int SUM = 0;
        double AVG = 0;
        int count = 0;
        while (true) {
            boolean isInt = s.hasNextInt();
            if (isInt) {
                int number = s.nextInt();
                SUM = SUM + number;
                count++;
                AVG = (double) SUM / count;
            } else {
                break;
            }
            s.nextLine();
        }
        System.out.println("SUM = " + SUM + " AVG = " + Math.round(AVG));
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
