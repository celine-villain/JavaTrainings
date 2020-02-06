package academy.learnprogramming;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        System.out.println(AreaCalculator.area(-1,4));
        MinutesToYearsDaysCalculator.printYearsAndDays(561600);
        IntEqualityPrinter.printEqual(1,2,3);
        System.out.println(PlayingCat.isCatPlaying(false, 35));
    }
}
