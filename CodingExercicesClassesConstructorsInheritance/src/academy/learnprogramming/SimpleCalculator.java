package academy.learnprogramming;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    //getters
    public double getFirstNumber() {
        return this.firstNumber;
    }
    public double getSecondNumber() {
        return this.secondNumber;
    }
    public double getAdditionResult () {
        return this.firstNumber + this.secondNumber;
    }
    public double getSubtractionResult () {
        return this.firstNumber - this.secondNumber;
    }
    public double getMultiplicationResult () {
        return this.firstNumber * this.secondNumber;
    }
    public double getDivisionResult () {
        return this.secondNumber != 0 ? this.firstNumber / this.secondNumber : 0;
    }

    //setters
    public void setFirstNumber(double number) {
        this.firstNumber = number;
    }
    public void setSecondNumber(double number) {
        this.secondNumber = number;
    }
}
