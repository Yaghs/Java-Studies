// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("New score is " + calculateScore("Tim",500));
        System.out.println("New Score is " + calculateScore(10));

        /**int newScore = calculateScore("Tim", 500);
        System.out.println("New Score is " + newScore);
        calculateScore(75);
        calculateScore();**/
    }
    public static int calculateScore(String playerName, int Score){
        System.out.println("Player " + playerName + "Scored " + Score + "points");
        return Score * 1000;
    }
    public static int calculateScore(int Score){
        System.out.println("Unnamed Player " + "Scored " + Score + " points");
        return Score * 1000;
    }
    public static int calculateScore(){
        System.out.println("No player name, no player score. ");
        return 0;
    }
}