public class EnhancedSwitchChallenge {
    public static void main(String[] args) {


        System.out.println(printDayOfWeek(0));
        System.out.println(printDayOfWeek(1));
        System.out.println(printDayOfWeek(2));
        System.out.println(printDayOfWeek(3));
        System.out.println(printDayOfWeek(4));
        System.out.println(printDayOfWeek(5));
        System.out.println(printDayOfWeek(6));
        System.out.println(printDayOfWeek(7));
        System.out.println("               ");
        System.out.println(printDayOfWeek(0));
        System.out.println(printDayOfWeek(1));
        System.out.println(printDayOfWeek(2));
        System.out.println(printDayOfWeek(3));
        System.out.println(printDayOfWeek(4));
        System.out.println(printDayOfWeek(5));
        System.out.println(printDayOfWeek(6));
        System.out.println(printDayOfWeek(7));



    }
    public static String printDayOfWeek(int day){
        return switch(day){
            case 0 -> {yield "sunday";}
            case 1 -> {yield "monday";}
            case 2 -> {yield "tuesday";}
            case 3 -> {yield "wedensday";}
            case 4 -> {yield "thursday";}
            case 5 -> {yield "friday";}
            case 6 -> {yield "Saturday";}
            default ->{
                String badResponse = "Invalid Day";
                yield badResponse;

            }
        };
    }
    /**
     *  OFFICIAL SOLUTION
     *
     *  public static void printDayOfWeek(int day){
     *         String dayOfWeek = switch(day){
     *             case 0 -> {yield "sunday";}
     *             case 1 -> {yield "monday";}
     *             case 2 -> {yield "tuesday";}
     *             case 3 -> {yield "wedensday";}
     *             case 4 -> {yield "thursday";}
     *             case 5 -> {yield "friday";}
     *             case 6 -> {yield "Saturday";}
     *             default ->{
     *                 String badResponse = "Invalid Day";
     *                 yield badResponse;
     *
     *             }
     *         };
     *     }
     *
     *
     *
     *
     * */
    public static String printWeekDay(int day){
        if(day == 0){
            return "sunday";
        }
        if(day == 1){
            return "monday";
        }
        if(day == 2){
            return "tuesday";
        }
        if(day == 3){
            return "wedensday";
        }
        if(day == 4){
            return "thursday";
        }
        if(day == 5){
            return "friday";
        }
        if(day ==6){
            return "saturday";
        }
        else{
            String s = "Invalid day";
            return s;
        }

    }
    /**
     *  BONUS CHALLENGE SOLUTION
     *
     *  public static void printWeekDay(int day){
     *      String dayOfWeek = "Invalid Day";
     *         if(day == 0){
     *             dayOfWeek = "sunday";
     *         }
     *         else if(day == 1){
     *             dayOfWeek = "monday";
     *         }
     *         else if(day == 2){
     *            dayOfWeek = "tuesday";
     *         }
     *         else if(day == 3){
     *             dayOfWeek = "wedensday";
     *         }
     *         else if(day == 4){
     *             dayOfWeek = "thursday";
     *         }
     *         else if(day == 5){
     *             dayOfWeek = "friday";
     *         }
     *         else if(day ==6){
     *             dayOfWeek = "saturday";
     *         }
     *         else{
     *             System.out.println("Invalid Day);
     *         }
     *          System.out.println(day + " stands for " + dayOfWeek);
     *
     *     }
     *
     *
     *
     *
     * **/
}
