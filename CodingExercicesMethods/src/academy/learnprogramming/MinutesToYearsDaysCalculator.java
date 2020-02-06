package academy.learnprogramming;

public class MinutesToYearsDaysCalculator {

    public static final String INVALID_VALUE = "Invalid Value";

    public static void printYearsAndDays (long minutes) {
        if (minutes < 0) {
            System.out.println(INVALID_VALUE);
        } else {
            long years = minutes / (24 * 60) / 365 ;
            long days = minutes / (24 * 60) % 365;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
