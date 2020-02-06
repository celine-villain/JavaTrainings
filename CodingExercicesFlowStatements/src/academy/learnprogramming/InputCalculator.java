package academy.learnprogramming;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage () {
        Scanner scanner = new Scanner (System.in) ;
        int number;
        int sum = 0;
        int count = 0;
        boolean hasNext = scanner.hasNextInt();

        while (hasNext) {
            hasNext = scanner.hasNextInt();
            number = scanner.nextInt();
            sum += number;
            hasNext = scanner.hasNextInt();
            count += 1;
        }

        System.out.println("SUM = " + sum + " AVG = " + Math.round(((double)sum / (double)count)));
    }
}
