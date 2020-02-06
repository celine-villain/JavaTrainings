package academy.learnprogramming;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {

        if (number < -1) {
            return -1;
        } else {
            int sum = 0;
            int num = number;
            int digit;

            while (num != 0) {
                digit = num % 10;
                sum = digit % 2 == 0 ? sum + digit : sum;
                num = num / 10;
            }
            return sum;
        }

    }
}
