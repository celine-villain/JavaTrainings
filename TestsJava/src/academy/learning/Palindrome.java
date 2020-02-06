package academy.learning;

public class Palindrome {
    public static boolean isPalindrome(String word) {
        String wordToTest = word.toLowerCase();
        int i = 0;
        int l = wordToTest.length();
        while(i < l) {
            if (wordToTest.charAt(i) != wordToTest.charAt(l - (i + 1))) {
                return false;
            } else {
                i++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}