// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class MainChallenge {
    public static void main(String[] args) {


        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int highScore = calculateScore(gameOver, score,levelCompleted,bonus);
        System.out.println("the highscore is: " + highScore);
        System.out.println("The next Highscore is: " + calculateScore(gameOver, score,levelCompleted,bonus));
        calculateScore(true, 800,5,100);
        calculateScore(true, 10000,8,200);



    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){


        int finalScore = score;

        if(gameOver){
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
        return finalScore;
    }
}