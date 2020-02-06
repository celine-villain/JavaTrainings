package academy.learnprogramming;

public class Ferrari extends Car {
    public Ferrari(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void accelerate() {
        System.out.println(this.getName() + " accelerates faster !");
    }

    @Override
    public void brake() {
        System.out.println(this.getName() + " brakes faster !");
    }
}
