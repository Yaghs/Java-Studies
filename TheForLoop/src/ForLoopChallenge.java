public class ForLoopChallenge {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 10; count < 3 && i <=50; i++){
            if(PrimeNumbers(i)){
                    System.out.println(i);
                    count ++;
            }
        }
    }
    public static boolean PrimeNumbers(int wholeNumber){
        if(wholeNumber <= 2){
            return (wholeNumber == 2);
        }
        for(int divisor = 2; divisor < wholeNumber / 2 ; divisor++){
            if(wholeNumber % divisor == 0){
                return false;
            }
        }
        return true;

    }
}
