package academy.learnprogramming;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        } else {
            int divided = 1;
            int i = 1;
            if (second < first) {
                int s = second;
                second = first;
                first = s;
            }
            while (i <= first) {
                i++;
                if (first % i == 0 && second % i == 0) {
                    divided = i;
                }
            }
            return divided;
        }
    }
}

