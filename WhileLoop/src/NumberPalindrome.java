public class NumberPalindrome {
    public static void main(String[] args) {

    }
    public static boolean isPalindrome(int number){
        int originalNumber = number;
        int reverse = 0;
        while(number != 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;

        }
        return originalNumber == reverse;
    }
}
