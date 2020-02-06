package academy.learnprogramming;

public class BankAccount {
    private int accountNumber;
    private int balance;
    private String customer;
    private String email;
    private String phoneNumber;

    public BankAccount (int accountNumber, String customer) {
        this.accountNumber = accountNumber;
        this.customer = customer;
    }

    //getters
    public int getAccountNumber () {
        return this.accountNumber;
    }
    public int getBalance () {
        return this.balance;
    }
    public String getCustomer () {
        return this.customer;
    }
    public String getEmail () {
        return this.email;
    }
    public String getPhoneNumber () {
        return this.phoneNumber;
    }

    //setters
    public void setAccountNumber (int number) {
        this.accountNumber = number;
    }
    public void setBalance (int balance) {
        this.balance = balance;
    }
    public void setCustomer (String customer) {
        this.customer = customer;
    }
    public void setEmail (String email) {
        this.email = email;
    }
    public void setPhoneNumber (String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds (int funds) {
        this.balance += funds;
        System.out.println("New balance : " + this.balance);
    }
    public void withdrawFunds (int funds) {
        if (this.balance < funds) {
            System.out.println("Insufficient funds");
        }
        this.balance = this.balance >= funds ? this.balance - funds : this.balance;
        System.out.println("New balance : " + this.balance);
    }
}
