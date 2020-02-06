package academy.learnprogramming;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        if (number < 10) {
            return false;
        } else {
            int reverse = 0;
            int num = number;

            while (num != 0) {
                int lastDigit = num % 10;
                reverse = reverse * 10 + lastDigit % 10;
                lastDigit = lastDigit / 10;
                num = num / 10;
            }

            if (reverse == number) {
                return true;
            } else {
                return false;
            }
        }
    }
}
