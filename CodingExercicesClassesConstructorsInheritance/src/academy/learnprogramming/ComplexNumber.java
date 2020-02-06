package academy.learnprogramming;

public class ComplexNumber {
    private double real;
    private double imaginary;

    //constructor
    public ComplexNumber (double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    //getter
    public double getReal () {
        return this.real;
    }
    public double getImaginary () {
        return this.imaginary;
    }

    //add
    public void add (double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }
    public void add (ComplexNumber c) {
        this.real += c.real;
        this.imaginary += c.imaginary;
    }
    //subtract
    public void subtract (double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }
    public void subtract (ComplexNumber c) {
        this.real -= c.real;
        this.imaginary -= c.imaginary;
    }


}
