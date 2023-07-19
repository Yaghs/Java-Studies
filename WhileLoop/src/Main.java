// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /** difference between for loop and while loop  **/
        /** For loop**/
        for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }
        /** while loop**/
        /** NOTE: if int j is 1 and the while loop is checking the parameter without incrementing the vairable j its an infinite loop**/
        int j = 1;
        while(j <= 5){
            System.out.println(j);
            j++;
        }
        /** another way to do while loop **/
        int f = 1;
        while(true){
           if(f < 5){
               break;
           }
            System.out.println(f);
            f++;

        }
        /**you can also do this type of while loop! the do-while loop's purpose is to run the loop ONLY ONCE **/
        /**a good example of using do while would be a username and password
         * Theoretical: when user puts the log in and password the do while loop will run the conditions once and output the result via a loop
         * practical: the do while loop will continue asking for the information until the conditions within the loop is met.
         * **/
        int k = 1;
        boolean isReady = false;
        do{
            if(k > 5){
                break;
            }
            System.out.println(k);
            k++;
        }while(isReady);
        /** how to use continue in a while loop**/

        int number = 0;
        while(number < 50){
            number += 5;
            if(number % 25 == 0){
                continue;
            }
            System.out.println(number + "_");
        }
    }
}