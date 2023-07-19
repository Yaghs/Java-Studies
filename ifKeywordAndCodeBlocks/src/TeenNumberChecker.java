public class TeenNumberChecker {
    public static void main(String[] args) {
    isTeen(21);
    }
    public static boolean HasTeen(int age1, int age2, int age3){
        boolean TrueTeen = false;
        if(age1 >= 13 || age1 <= 19 || age2 >= 13 || age2<= 19 || age3 >= 13 || age3 <= 19){
            TrueTeen = true;
            return TrueTeen;
        }
        return TrueTeen;
    }
    public static boolean isTeen(int teenAge){
        if(teenAge >= 13 || teenAge <= 19){
            return true;
        }
        else{
            return false;
        }
    }
}
