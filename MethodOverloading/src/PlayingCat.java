public class PlayingCat {
    public static void main(String[] args) {
        boolean cat = isCatPlaying(false,34);
        System.out.println(cat);
    }
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer = true) {
            if (temperature >= 25 && temperature <= 45) {
                return true;

            } else if (temperature < 25 || temperature > 45) {
                return false;
            }
        }
        if (summer = false) {
            if (temperature >= 25 && temperature <= 35) {
                return true;
            } else if (temperature < 25 || temperature > 35) {
                return false;

            }

        }
        return false;


    }
}