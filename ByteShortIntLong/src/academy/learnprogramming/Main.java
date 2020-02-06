package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int highScorePosition;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        // Challenge
        highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Céline", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Céline", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Céline", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Céline", highScorePosition);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;

    }

    public static void displayHighScorePosition (String pName, int pPosition) {
        System.out.println(pName + " managed to get into position "
                + pPosition + " on the high score table");
    }

    public static int calculateHighScorePosition (int pPlayerScore) {
        int score = pPlayerScore > 1000 ? 1 :
                (pPlayerScore < 1000 && pPlayerScore > 500 ? 2 :
                        (pPlayerScore < 500 && pPlayerScore > 100 ? 3 : 4)) ;
        return score;
    }
}