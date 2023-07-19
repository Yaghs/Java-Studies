public class FirstLastDigitSum {
    public static void main(String[] args) {

    }
    public static int sumFirstAndLastDigit(int number){
        int lastNumber = 0;
        int firstNumber = 0;
        if(number < 0){
            return -1;
        }
        lastNumber = number % 10;
        while(number > 0){


            firstNumber = number % 10;
            number = number / 10;

        }
        return firstNumber + lastNumber;
    }
}
