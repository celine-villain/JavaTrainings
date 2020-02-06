package academy.learning;

public class AverageBugs
{
    public static double Average(int[] input)
    {
        //You may NOT use Linq
        int sum = 0;
        for(var i = 0; i <= input.length; i++){
            sum = input[i];
        }
        return sum / 2;
    }

    public static void Main(String[] args)
    {
        System.out.println("Average of [2, 1] was:" + Average(2, 1));
        System.out.println("Average of [2, -1] was:" + Average(2, -1));
        System.out.println("Average of [1, 2, 3] was:" + Average(1, 2, 3));
        System.out.println("Average of [] should be double.NaN but was:" + Average());

    }
}