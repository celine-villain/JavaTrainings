package academy.learnprogramming;

public class LastDigitChecker {
    public static boolean hasSameLastDigit (int var1, int var2, int var3) {
        if (!(isValid(var1)) || !(isValid(var2)) || !(isValid(var3))) {
            return false;
        } else {
            return var1 % 10 == var2 % 10 || var1 % 10 == var3 % 10 || var2 % 10 == var3 % 10 ? true : false;
        }
    }

    public static boolean isValid (int number) {
        return number >= 10 && number <= 1000 ? true : false;
    }
}
