public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Shahin");
       boolean isAlien = false;
       if(isAlien == false){
           System.out.println("It is not an alien");
           System.out.println("And im scared of aliens");
       }
       int topScore = 100;
       if(topScore == 100){
           System.out.println("you got the top score");
       }
       int secondTopScore = 60;
       if((topScore > secondTopScore) && (topScore < 100)){
           System.out.println("Greater than second top score and less than 100");
       }
        if((topScore > 90) || (topScore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }
        int newValue = 50;
        if(newValue == 50){
            System.out.println("This is an error");
        }
        boolean isCar = false;
        if (isCar == false){
            System.out.println("This is not supposed to happen");
        }
        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? true: false;

        if(isDomestic){
            System.out.println("this car is domestic to our country");
        }
        String s = (isDomestic)? "this car is domestic " : "this car is not domestic";

        System.out.println(s);
        double a = 20.00;
        double b = 80.00;
        double c = (a + b) * 100;
        double d = c % 40.00;
        System.out.println(d);
        boolean Challenge = (d == 0.00);
        System.out.println(Challenge);

        if (Challenge) {
            System.out.println("the remainder is 0");
        }

        if (!Challenge) {
            System.out.println("there is still some remainder left");
        }
    }


}
