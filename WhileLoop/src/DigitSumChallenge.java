public class DigitSumChallenge {
    public static void main(String[] args) {
        int digitSum = sumDigits(123);
        System.out.println(digitSum);
    }
    public static int sumDigits(int num){
        if( num < 0){
            return -1;
        }
        else{
            int sum = 0;
            /** its so that the loop keeps going for numbers that have 2 digits**/
          while(num > 9) {
              sum += num % 10;
              num = num / 10;

          }

          sum += num;
            return sum;
        }
        // how to do the digit sum
        //first initialize the integer
        //second find the remainder using modulo or % operator
        //add the last digit to the variable sum
        //divide the integer by 10


    }
}
