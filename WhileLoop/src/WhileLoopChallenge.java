public class WhileLoopChallenge {
    public static void main(String[] args) {
       int number = 4;
       int finishNumber = 20;
       int EvenNumCount = 0;
       int OddNumCount = 0;
        while(number <= finishNumber){
            number++;

            if(!isEvenNumber(number)){
                OddNumCount++;
                continue;

            }
            System.out.println(number);

            EvenNumCount++;



            if(EvenNumCount >= 5 && OddNumCount >= 5){
                break;
            }


        }
        System.out.println("number of even numbers are: " + EvenNumCount);
        System.out.println("Number of Odd numbers are: " + OddNumCount);
    }
    public static boolean isEvenNumber(int number){
        if(number % 2 == 0){
            return true;
        }
        else{
            return false;
        }

    }
}
