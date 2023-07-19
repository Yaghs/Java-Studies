public class SpeedConverter {
    public static void main(){
        toMilesPerHour(65);
    }
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0){
            return -1;
        }
        else{
            kilometersPerHour = kilometersPerHour / 1.609;
            long rounded = Math.round(kilometersPerHour);
            return rounded;
        }

    }
    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }
        double MilesPerHour = kilometersPerHour / 1.609;
        long rounded =(int) Math.round(MilesPerHour);
        System.out.println(kilometersPerHour+" km/h = " + MilesPerHour + " mi/h");
    }

}
