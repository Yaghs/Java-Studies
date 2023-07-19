public class TraditionalSwitchChallenge {
    public static void main(String[] args) {
       NatoWords('A');
    }
    public static void NatoWords(char alphabet){
        switch(alphabet){
            case 'A':
                System.out.println("Able");
                break;
            case 'B':
                System.out.println("Baker");
                break;
            case 'C':
                System.out.println("Charlie");
                break;

            case 'D':
                System.out.println("Dog");
                break;
            case 'E':
                System.out.println("Easy");
                break;

            default:
                System.out.println("Not a word in the alphabet");
                break;

        }

    }}
