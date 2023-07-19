public class BarkingDog {
    public static void main(String[] args) {
        shouldWakeUp(true,9);
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfday){

        if(barking && hourOfday >= 8 && hourOfday<=22){
            barking= true;
            return barking;
        }
        else if(hourOfday < 0 || hourOfday > 23){
            barking= false;
            return barking;
        }
        return barking;
    }
}
