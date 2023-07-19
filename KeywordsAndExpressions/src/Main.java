// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        double kilometers=(100 * 1.609344);
        int highscore = 50;
        if(highscore > 25){
            highscore = 1000 + highscore; //add bonus points
        }
        int health = 100;
        if((health < 25) && (highscore > 1000)){
            highscore = highscore - 1000;
        }
        int myVariable = 50;
        myVariable++;
        myVariable--;
        System.out.println("this is a test");
        System.out.println("this is" + "another" + "still more");
        
    }
}