public class SumChallenge {
    public static void main(String[] args) {
        SumNumber(50);

    }
    public static void SumNumber(int i){
        int sum = 0;
        int counter = 0;
        for(i = i; counter < 5 && i <= 1000;  i++){
            if(i%3==0 && i%5==0){
                sum += i;
                counter++;
                if(counter == 5) {
                    System.out.println(sum);
                    break;

                }
            }        }
    }
}
