public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1900));

    }
    public static boolean isLeapYear(int year){
        if(year >= 1 && year <= 9999){
            if(year % 4 == 0){
                if(year % 100 == 0){
                    if(year % 400 == 0){
                        return true;
                    }
                    return false;
                }
                return true;
            }
            else{
                return false;
            }

        }
        return false;
    }
  public static int getDaysInMonth(int month, int year){
        if( month < 1 || month > 12){
            return -1;

        }
        if(year < 1 || year > 9999){
            return -1;
        }

      boolean isLeap = isLeapYear(year);
      if (isLeap && month == 2) {
          return 29;
      }
      else if (month == 2) {
          return 28;
      }
      else if (month == 4 || month == 6 || month == 9 || month == 11) {
          return 30;
      }
      else {
          return 31;
      }

    }
}
