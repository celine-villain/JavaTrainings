package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Scanner scanner = new Scanner (System.in);
        int sum = 0;
        String print = "";
	    for (int i = 1; i < 10; i ++) {
            int number;
            System.out.println("Write the number : " + i);
	        while (scanner.hasNextInt() == false) {
                System.out.println("Invalid Value");
                scanner.nextLine();
                System.out.println("Write the number : " + i);
	        }
	        number = scanner.nextInt();
	        sum += number;
	        print = print + number + " + ";
        }
        System.out.println(print + " = " + sum);*/

        //InputCalculator.inputThenPrintSumAndAverage();
        System.out.println(PaintJob.getBucketCount(-3.4,2.1,1.5,2));
        System.out.println(PaintJob.getBucketCount(3.4,2.1,1.5,2));
        System.out.println(PaintJob.getBucketCount(-3.4,2.1,1.5));
        System.out.println(PaintJob.getBucketCount(3.4,2.1,1.5));
        System.out.println(PaintJob.getBucketCount(3.4,1.5));
        System.out.println(PaintJob.getBucketCount(6.26,2.2));
    }
}
