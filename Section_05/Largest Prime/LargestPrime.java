public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number <= 0 || number == 1)
            return -1;
        else {
            int div = 2;
            while (div < number) {
                if (number % div != 0) {
                    div++;
                } else {
                    number /= div;
                    //number = number / div;
                }
            }
            return number;
        }
    }

    public static void main(String[] args) {
        System.out.println(getLargestPrime(1));
    }
}
