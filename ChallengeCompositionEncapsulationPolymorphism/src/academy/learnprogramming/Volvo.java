package academy.learnprogramming;

public class Volvo extends Car {
    public Volvo(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void accelerate() {
        System.out.println(this.getName() + " accelerates very fast !");
    }

    @Override
    public void brake() {
        System.out.println(this.getName() + " Volvo brakes !");
    }
}
