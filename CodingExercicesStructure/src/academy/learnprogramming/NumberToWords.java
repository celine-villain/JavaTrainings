package academy.learnprogramming;

public class NumberToWords {

    public static void numberToWords (int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int rev = reverse(number);
            int lengthRev =  getDigitCount(rev);
            int lengthNumber = getDigitCount(number);
            for (int i = 1; i <= lengthRev; i++) {
                int digit = rev % 10;
                rev = rev / 10;
                String word = "";
                switch (digit) {
                    case 0:
                        word = "Zero";
                        break;
                    case 1:
                        word = "One";
                        break;
                    case 2:
                        word = "Two";
                        break;
                    case 3:
                        word = "Three";
                        break;
                    case 4:
                        word = "Four";
                        break;
                    case 5:
                        word = "Five";
                        break;
                    case 6:
                        word = "Six";
                        break;
                    case 7:
                        word = "Seven";
                        break;
                    case 8:
                        word = "Eight";
                        break;
                    case 9:
                        word = "Nine";
                        break;
                }
                System.out.println(word);
            }
            if (lengthRev < lengthNumber) {
                for (int i = 1; i <= lengthNumber-lengthRev; i++) {
                    System.out.println("Zero");
                }
            }
        }
    }

    public static int getDigitCount (int number) {
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        } else {
            int count = 0;
            int num = number;
            while (num != 0) {
                count += 1;
                num = num / 10;
            }
            return count;
        }
    }

    public static int reverse (int number) {
        int rev = 0;
        int num = number;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        return rev;
    }

}
