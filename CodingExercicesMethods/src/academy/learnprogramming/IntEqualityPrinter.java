package academy.learnprogramming;

public class IntEqualityPrinter {
    private static final String INVALID_VALUE = "Invalid Value";
    private static final String EQUAL_VALUE = "All numbers are equal";
    private static final String DIFFERENT_VALUE = "All numbers are different";
    private static final String NEITHER_VALUE = "Neither all are equal or different";
    public static void printEqual (int var1, int var2, int var3) {
        if (var1 < 0 || var2 <0 || var3 < 0) {
            System.out.println(INVALID_VALUE);
        } else if (var1 == var2 && var1 == var3) {
            System.out.println(EQUAL_VALUE);
        } else if (var1 != var2 && var1 != var3 && var2 != var3) {
            System.out.println(DIFFERENT_VALUE);
        } else {
            System.out.println(NEITHER_VALUE);
        }
    }
}
