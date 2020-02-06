package academy.learnprogramming;

public class DiagonalStar {
    public static void printSquareStar (int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int r = 1; r <= number; r++) {
                for (int c = 1; c <= number; c++) {
                    if (r == c || r == 1 || r == number || c == 1 || c == number || c == number - r + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
