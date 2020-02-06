package academy.learning;

public class Main {

    public static void main(String[] args) {
	    BankAccount account = new BankAccount("12345-678", 1000.00);
	    Person joris = new Person ("Joris", account);
	    Person celine = new Person ("Céline", account);

	    new Thread(new Runnable() {
            @Override
            public void run() {
                joris.getBankAccount().deposit(300.00);
                joris.getBankAccount().withdraw(50.00);

            }
        }, "First thread").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                celine.getBankAccount().deposit(203.75);
                celine.getBankAccount().withdraw(100.00);
            }
        }, "Second thread").start();

    }
}
