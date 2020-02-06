package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        getDurationString(61,2);
        getDurationString(3602);
    }

    public static void getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
            System.out.println(minutes / 60 + "h " + minutes % 60 + "m " + seconds + "s");
        } else {
            System.out.println("Invalid Value");
        }
    }

    public static void getDurationString (int seconds) {
        if (seconds >= 0) {
            int minutes = seconds / 60;
            getDurationString(minutes, seconds % 3600);
        } else {
            System.out.println("Invalid Value");
        }
    }
}
