public class MethodChallenge {
    public static void main(String[] args) {

        int PlayerPositition=calculateHighScorePosition(1500);
        displayHighScorePosition("Shahin", PlayerPositition);
        PlayerPositition=calculateHighScorePosition(1000);
        displayHighScorePosition("Tim", PlayerPositition);

        PlayerPositition=calculateHighScorePosition(500);
        displayHighScorePosition("Percy", PlayerPositition);

         PlayerPositition=calculateHighScorePosition(100);
        displayHighScorePosition("Gilbert", PlayerPositition);

        PlayerPositition=calculateHighScorePosition(25);
        displayHighScorePosition("James", PlayerPositition);



    }
    public static void displayHighScorePosition(String PlayerName, int PlayerPosition){

        System.out.println(PlayerName + "Managed to get into position: " + PlayerPosition + " on the high score list");
    }
    public static int calculateHighScorePosition(int playerScore){
        int position = 4;
        if(playerScore >= 1000){
           position = 1;
        }
        if(playerScore >= 500){
            position = 2;
        }
        if(playerScore >= 100){
            position = 3;
        }
           return position;
    }
}
