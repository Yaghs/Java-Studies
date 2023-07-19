public class SharedDigit {
    public static void main(String[] args) {

    }
    public static boolean hasSharedDigit(int firstNum, int secondNum){
        if(firstNum < 10 || firstNum > 99 || secondNum < 10 || secondNum > 99){
            return false;
        }
        int FirstNumLastDigit = 0;
        int FirstNumFirstDigit = 0;
        int SecondNumLastDigit = 0;
        int SecondNumFirstDigit = 0;

        // Gets the last digit of both numbers
        FirstNumLastDigit = firstNum % 10;
        SecondNumLastDigit = secondNum % 10;

        while(firstNum > 10 && firstNum <= 99){

            FirstNumFirstDigit = firstNum / 10;
            firstNum /= 10;

        }
        while(secondNum > 10 && secondNum <= 99){
            SecondNumFirstDigit = secondNum / 10;
            secondNum /= 10;
        }
        if(FirstNumFirstDigit == SecondNumFirstDigit || FirstNumLastDigit == SecondNumLastDigit){
            return true;
        }
        if(FirstNumFirstDigit == SecondNumLastDigit || FirstNumLastDigit == SecondNumFirstDigit){
            return true;
        }
        return false;
    }
}
