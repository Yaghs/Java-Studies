public class SumOddRange {
    public static void main(String[] args) {

    }
    public static boolean isOdd(int number){
        if(number > 0){
            return number % 2 != 0;

        }
        return false;


    }

    public static int sumOdd(int start, int end){


      if(start > 0 && end > 0 && start <= end) {
          int sumStart = 0;
          for (int i = start; i <= end; i++) {
             if(isOdd(i)) {
                 sumStart += i;
             }



          }
          return sumStart;
      }
      return -1;
    }
}
