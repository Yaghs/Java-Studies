public class LastDigitChecker {
    public static void main(String[] args) {

    }
    public static boolean isValid(int ValidNum){
        if(ValidNum >= 10 && ValidNum <= 1000){
            return true;
        }
        return false;
    }
    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (isValid(a)&& isValid(b) && isValid(c)){
            int lastDigit_A = a % 10;
            int lastDigit_B = b % 10;
            int lastDigit_C = c % 10;


            if (lastDigit_A == lastDigit_B || lastDigit_B == lastDigit_C || lastDigit_A == lastDigit_C) {
                return true;
            }
            return false;
        }
        return false;
    }
}
