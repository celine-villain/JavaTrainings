package academy.learnprogramming;

public class PlayingCat {
    public static boolean isCatPlaying (boolean summer, int temperature) {
        if (summer) {
            return temperature <= 45 && temperature >= 25 ? true : false;
        } else  {
            return temperature <= 35 && temperature >= 25 ? true : false;
        }
    }
}
