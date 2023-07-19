public class DecimalComparator {
    public static void main(String[] args) {

    }
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        long multiplied1 = (long) (num1 * 1000);
        long multiplied2 = (long) (num2 * 1000);
        long rounded1 = Math.round(multiplied1);
        long rounded2 = Math.round(multiplied2);

        return rounded1 == rounded2;
    }
}
