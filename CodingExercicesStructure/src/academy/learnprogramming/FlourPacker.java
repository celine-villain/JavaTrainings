package academy.learnprogramming;

public class FlourPacker {

    public static boolean canPack (int bigCount, int smallCount, int goal) {
        if (bigCount >= 0 && smallCount >= 0 && goal >= 0) {
            int sum = 5 * bigCount + smallCount;
            if (sum == goal) {
                return true;
            } else if (sum > goal) {
                int diff = sum - goal;
                int nbBigMax = goal / 5;
                int nbSmall = smallCount - diff % 5;
                if (bigCount > nbBigMax) {
                    return smallCount >= goal - 5 * nbBigMax ? true : false;
                } else {
                    return smallCount >= goal - 5 * bigCount ? true : false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}