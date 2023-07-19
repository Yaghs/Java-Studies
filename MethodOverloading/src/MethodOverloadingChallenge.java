public class MethodOverloadingChallenge {
    public static void main(String[] args) {
        System.out.println("The centimeter value is: " + convertToCentimeters(68));
        System.out.println("The centimeter value is: " + convertToCentimeters(5,8));

    }
    /**The first method has one parameter of type int which represents the entire height in inches, You'll convert inches to centimeters,
     * in this method and pass back the number of centimeters as a double **/
    public static double convertToCentimeters(int HeightInInches){
        double conversion = HeightInInches * 2.54;
        return conversion;
    }

    /** The second method has two parameters of type int, one to represent height in feet, and one to represent the remaining height in inches.
     * So if a person is 5 foot, 8 inches the convert feet and inches to just inches, then call the first method, to get the number of centimeters also returning the
     * value as a double**/
    public static double convertToCentimeters(int HeightInFeet, int HeightInInches){
        double InchConversion = HeightInFeet * 12;
        InchConversion = InchConversion + HeightInInches;
        double conversion = InchConversion * 2.54;
        return conversion;
        /** ALTERNATIVE SOLUTION
         *
         * return convertToCentimeters((feet * 12) + inches);

         * **/
    }
    /**ANOTHER ALT SOLUTION
    public static double convertToCentimeters(int feet, int inches){
        int feetToInches = feet * 12;
        int totalInches = feetToInches + inches;
        double result = convertToCentimeters(totalInches);
        return result;

    }
     **/
}
/**Notes
 * 1 inch = 2.54 cm
 * 1 foot = 12 inches
 * **/