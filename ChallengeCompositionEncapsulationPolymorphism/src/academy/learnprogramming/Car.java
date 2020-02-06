package academy.learnprogramming;

public class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    //constructor
    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }

    //getters
    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }

    //methods
    public void startEngine () {
        System.out.println(this.name + " is starting !");
    }

    public void accelerate () {
        System.out.println(this.name + " accelerates !");
    }

    public void brake () {
        System.out.println(this.name + " brakes !");
    }
}
