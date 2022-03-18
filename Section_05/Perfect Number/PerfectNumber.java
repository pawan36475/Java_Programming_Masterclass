public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        boolean b = false;
        if (number < 1) {
            return false;
        } else {

            for (int i = 1; i <= number; i++) {
                if ((number % i == 0) && (i != number)) {
                    sum = sum + i;

                }
                if (sum == number)
                    b = true;
            }
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(1));
    }
}


