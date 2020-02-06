public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double number1, double number2) {
        if ((long)(1000L * number1) == (long)(1000L * number2)) {
            return true;
        } else {
            return false;
        }
    }
}
