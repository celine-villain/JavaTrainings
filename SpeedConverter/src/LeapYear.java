public class LeapYear {
    public static boolean isLeapYear (int year) {
        boolean result;
        if (year < 1 || year > 9999) {
            result = false;
        } else {
           result = year % 4 != 0 ? false : year % 100 != 0 ? true : year % 400 != 0 ? false : true;
        }
        return result;
    }
}
