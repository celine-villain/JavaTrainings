public class TestNumberChecker {
    public static boolean hasTeen (int var1, int var2, int var3) {
        if ((var1 >= 13 & var1 <= 19) || (var2 >= 13 & var2 <= 19) || (var3 >= 13 & var3 <= 19)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen (int var1) {
        if ((var1 >= 13 & var1 <= 19)) {
            return true;
        } else {
            return false;
        }
    }
}
