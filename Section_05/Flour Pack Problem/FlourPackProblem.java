public class FlourPackProblem {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int sum = (bigCount * 5) + smallCount;
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        } else {
            if (sum == goal)
                return true;
            else if (sum > goal) {
                if (smallCount > goal)
                    return true;
                else {
                    int check = 0;
                    for (int i = 0; i <= bigCount; i++) {
                        for (int j = 0; j <= smallCount; j++) {
                            check = (i * 5) + j;
                            if (check == goal) {
                                return true;
                            }
                        }
                    }
                }
            }

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 5));
    }
}
