public class NumberToWords {

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int digitCount = getDigitCount(number);
            int rev = reverse(number);
            int digit;
            for (int i = 0; i < digitCount; i++) {
                digit = rev % 10;
                rev = rev / 10;
                if (digit > 0) {
                    if (digit == 1) System.out.println("One");
                    else if (digit == 2) System.out.println("Two");
                    else if (digit == 3) System.out.println("Three");
                    else if (digit == 4) System.out.println("Four");
                    else if (digit == 5) System.out.println("Five");
                    else if (digit == 6) System.out.println("Six");
                    else if (digit == 7) System.out.println("Seven");
                    else if (digit == 8) System.out.println("Eight");
                    else if (digit == 9) System.out.println("Nine");
                } else
                    System.out.println("Zero");
            }

        }

    }

    public static int getDigitCount(int number) {
        int count = 0;
        if (number < 0) return -1;
        if (number == 0) return 1;
        while (number != 0) {
            count++;
            number = number / 10;
        }
        return count;
    }

    public static int reverse(int number) {
        int rev = 0;
        int val = 0;
        while (number != 0) {
            val = number % 10;
            rev = (rev * 10) + val;
            number /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        numberToWords(-12);
    }
}
