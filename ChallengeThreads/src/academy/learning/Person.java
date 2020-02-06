package academy.learning;

public class Person {
    private final String name;
    private final BankAccount bankAccount;

    public Person(String name, BankAccount bankAccount) {
        this.name = name;
        this.bankAccount = bankAccount;
    }

    public String getName() {
        return name;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

}
