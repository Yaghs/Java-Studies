public class EnhancedSwitchStatement {
    public static void main(String[] args) {
        String month = "APRIL";
        System.out.println(month + " is in the " + getQuarter(month) + "quarter");
    }
    public static String getQuarter(String month){
        return switch (month) {
            case "JANUARY", "FEBRUARY", "March" -> {yield "1st";}
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
           /** default -> "Bad";**/
           default ->{
               String badResponse = month + " is bad";
               yield badResponse;
               /**yield is a switch expression meant for returning values  **/
           }
        };
    }
}
