package academy.learning;

public class MathUtils {
    public static double Average(int a, int b)
    {
        return (double) (a + b / 2);
    }

    public static void main(String[] args) {
        System.out.println(Average(2,1));
    }
}
