public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        String durationString1 = getDurationString(56);
        String durationString2 = getDurationString(67, 42);
        System.out.println(durationString1);
        System.out.println(durationString2);
    }
    /**
     * In this challenge, we're going to create a method that takes time represented in seconds in a parameter
     *
     * we'll then want to transform the seconds into hours.
     *
     * next we'll display the time in hours, with the remaining minutes and seconds, in a string
     *
     * we'll do this transformation in two steps, which allows us to use overloaded methods
     *
     *
     * We want to create two methods with the same name: getDurationString
     * the first method has one parameter of type int, named seconds.
     * the second method has two parameters, named minutes and seconds, both ints.
     * both methods return a String in the format shown:
     * 'XXh YYm ZZs'
     * where XX represents the number of hours, YY the number of minutes and ZZ the number of seconds.
     * the first method should in turn call the second method to return its results
     * make both methods public and static as we've been doing so far in this course.
     * Remember that one minute is 60 seconds, and one hour equals 60 minutes or 3600 seconds.
     *
     * add validation as a bonus:
     * for the first method, the seconds parameter should be >= 0.
     * for the second method, the minutes parameter should be >= 0 and the seconds parameter should be >=0. and <=59.
     * if either method is passed and invalid value, print out some type of meaningful message to the user.
     *
     *
     * **/

    public static String getDurationString(int seconds){
        if(seconds >= 0){
            int minutes = seconds / 60;
            int remainingSeconds = minutes % 60;
            String MinutesTime = remainingSeconds + "m";
            return MinutesTime;

        }
        else{
            return "Invalid Value";
        }
/**
 * correct solution
 *
 * int minutes = seconds / 60;
 * int hours = minutes / 60;
 * System.out.println("Hours = " + hours);
 *
 *int remainingMinutes = minutes % 60;
 * System.out.println("minutes = " + minutes);
 * System.out.println("remaining minutes = " + remainingMinutes);
 *
 * int remainingSeconds = seconds % 60;
 * System.out.println("remainingSeconds = " + remainingSeconds);
 *
 * return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
 *
 * NOTE: The difference between minutes and remaining minutes is that in remainingMinutes you use the remainder operator or % to get a better result than say 67 minutes
 *
 * /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 * The cleaner version of this code is the following:
 * int minutes = seconds / 60;
 * int hours = minutes / 60;
 *
 * int remainingMinutes = minutes % 60;
 * int remainingSeconds = seconds % 60;
 *
 * return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
 *
 * Note: this works but code duplication is a poor practice in coding so do this instead:
 *
 * int minutes = seconds / 60;
 * return getDurationString(minutes: seconds/60 , seconds%60);
 *
 * **/

    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes >= 0 || minutes <= 59 && seconds >= 0 || seconds <= 59) {
            int hours = minutes / 60;
            int RemainingMinutes = minutes % 60;
            String time = hours + "h" + " " + minutes + "m" + " " + seconds + "s";
            return time;
        }
        else{
            return "Invalid Value for seconds(" + seconds + "), must be a positive integer value";
        }
        /**
         * correct solution:
         *  * if( minutes < 0){
         *      return "Invalid data for minutes(" + minutes + "), must be a positive integer value";
         *  }
         *  * if(seconds <= 0 || seconds >= 59){
         *      return "Invalid data for seconds(" + seconds +"), must be between 0 and 59";
         *  }
         *  * int hours = minutes / 60;
         *  *
         *  * int remainingMinutes = minutes % 60;
         *  * int remainingSeconds = seconds % 60;
         *  *
         *  * return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
         *
         *
         * **/

    }
}
