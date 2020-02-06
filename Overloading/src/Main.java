public class Main {
    public static void main (String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(0,1));
    }

    public static double calcFeetAndInchesToCentimeters (double feet, double inches) {
        if (feet >= 0 || (inches >=0 && inches <=12)) {
            return 12*2.54*feet + 2.54*inches;
        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters (double inches) {
        if (inches >=0) {
            double nbFeet = inches / 12;
            return calcFeetAndInchesToCentimeters(nbFeet,inches);
        } else {
            return -1;
        }
    }
}
