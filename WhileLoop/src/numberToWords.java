public class numberToWords {

    public static int reverse(int number){
        int reversed = 0;
        for(;number != 0; number /= 10){
            int digit = number % 10;
            reversed = reversed * 10 + digit;
        }
        return reversed;
    }
    public static int getDigitCount(int number){
        if(number == 0){
            return 1;
        }
        if(number < 0){
            return -1;
        }
        int count = 0;
        while(number != 0){
            number /= 10;
            count ++;
        }
        return count;
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        if (number == 0) {
            System.out.println("Zero");
            return;
        }

        int reversedNumber = reverse(number);
        int digitCount = getDigitCount(number);

        while (reversedNumber > 0) {
            int digit = reversedNumber % 10;
            switch (digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            reversedNumber /= 10;
        }
        while (digitCount > getDigitCount(reverse(number))) {
            System.out.println("Zero");
            digitCount--;
        }

    }

}
