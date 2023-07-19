public class PerfectNumber {
    public static void main(String[] args) {

    }
    public static boolean isPerfectNumber(int number){
        if(number < 1){
            return false;
        }
        int a = 0;
        /**this runs the loop to begin the processs of determining perfect numbers **/
        for(int i = 1; i < number; i++){
        /**this if statement checks to see if the i can be a divisor to number
         *
         * if so: add the number to a which can be called the variable sum
         *
         *
         *
         * **/
            if(number % i == 0){
                a += i;

            }


        }
        /** through this process it checks if a when added together matches the number itself**/
        if(a==number){
            return true;
        }
        return false;

    }
}
