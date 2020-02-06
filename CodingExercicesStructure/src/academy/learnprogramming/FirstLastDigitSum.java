package academy.learnprogramming;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit (int number) {
        if (number < 0) {
            return -1;
        } else {
            int lastDigit = number % 10;
            int firstDigit = number;

            while (firstDigit / 10 != 0 ) {
                firstDigit = firstDigit / 10;
            }

            return firstDigit + lastDigit;
        }
    }
}
