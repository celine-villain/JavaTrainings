package academy.learnprogramming;

public class LargestPrime {
    public static int getLargestPrime (int number) {
        if (number > 1) {
            int i = 2;
            int largestPrime = 1;
            while (i <= number) {
                if (number % i == 0) {
                    boolean isPrime = true;
                    int j = 2;
                    while (j < i && isPrime) {
                        System.out.println(i + " % " + j + " = " + i % j);
                        isPrime = i % j != 0;
                        j++;
                    }
                    largestPrime = isPrime ? i : largestPrime;
                }
                i++;
            }
            return largestPrime;
        } else {
            return -1;
        }
    }
}
