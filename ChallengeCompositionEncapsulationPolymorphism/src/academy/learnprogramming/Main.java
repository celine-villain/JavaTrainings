package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Car randomCar = new Car(3, "My sweet car");
        Ferrari ferrari = new Ferrari(4,"Super car");
        Volvo volvo = new Volvo(3, "Nice car");
        Clio clio = new Clio (2, "My car");

        randomCar.accelerate();

        clio.startEngine();
        volvo.startEngine();
        ferrari.startEngine();
        clio.accelerate();
        volvo.accelerate();
        ferrari.accelerate();
        clio.brake();
        volvo.brake();
        ferrari.brake();
    }
}
