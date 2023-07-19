public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(-4232);
    }
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");

        }
        else {
            long year = 365 * 24 * 60;
            long days = 24 * 60;
            long minutesToYears = minutes / year;
            long minutesToDays = minutes / days;

            System.out.println(minutes + "min = " + minutesToYears + " y " + "and " + minutesToDays + " d ");
        }

    }
}
