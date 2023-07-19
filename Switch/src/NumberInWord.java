public class NumberInWord {
    public static void main(String[] args) {
        printNumberInWord(1);
    }
    public static void printNumberInWord(int number) {

        String day;
        switch (number) {
            case 0:
                day = "ZERO";
                break;
            case 1:
                day = "ONE";
                break;
            case 2:
                day = "TWO";
                break;
            case 3:
                day = "THREE";
                break;
            case 4:
                day = "FOUR";
                break;
            case 5:
                day = "FIVE";
                break;
            case 6:
                day = "SIX";
                break;
            case 7:
                day = "SEVEN";
                break;
            case 8:
                day = "EIGHT";
                break;
            case 9:
                day = "NINE";
                break;

            default:
                day = "OTHER";
                break;
        };
        System.out.println(day);
    }
}
