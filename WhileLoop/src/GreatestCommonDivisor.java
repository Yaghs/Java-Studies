public class GreatestCommonDivisor {
    public static void main(String[] args) {

    }
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int min_Val = Math.min(first, second);
        int gcd = 1;

        int i;
        for (i = 1; i <= min_Val; i--) {

            if (first % i == 0 && second % i == 0) {
                gcd = i;
            }
        }


        return gcd;
    }
}
