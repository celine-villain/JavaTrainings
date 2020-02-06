package academy.learnprogramming;

public class SharedDigit {
    public static boolean hasSharedDigit (int var1, int var2) {
        if (var1 < 10 || var1 > 99 || var2 < 10 || var2 > 99) {
            return false;
        } else {
            int lastDigit1 = var1 % 10;
            int lastDigit2 = var2 % 10;
            int firstDigit1 = var1 / 10 ;
            int firstDigit2 = var2 / 10 ;

            return lastDigit1 == firstDigit2 || lastDigit1 == lastDigit2 ? true :
                        firstDigit1 == firstDigit2 || lastDigit1 == lastDigit2 ? true : false;
        }
    }
}
