package academy.learnprogramming;

public class SumOddRange {
    public static boolean isOdd (int number) {
        return number < 0 ? false : number % 2 == 0 ? false : true;
    }

    public static int sumOdd (int start, int end) {
        if (start <= end && start >= 0 && end >= 0) {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                sum = isOdd(i) ? sum + i : sum;
            }
            return sum;
        } else {
            return -1;
        }
    }
}
