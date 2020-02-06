package academy.learnprogramming;

public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            return year % 4 == 0 && year % 100 != 0 ? true : year % 400 == 0 ? true : false;
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        int nbDays;
        if (month < 1 || month > 12) {
            nbDays = -1;
        } else if (year < 1 || year > 9999) {
            nbDays = -1;
        } else {
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    nbDays = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    nbDays = 30;
                    break;
                case 2:
                    nbDays = isLeapYear(year) ? 29 : 28;
                    break;
                default:
                    nbDays = -1;
                    break;
            }
        }
        return nbDays;
    }
}
