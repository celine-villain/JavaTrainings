package academy.learning;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private double balance;
    private String accountNumber;
    private Lock lock;

    public BankAccount (String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.lock = new ReentrantLock();
    }

    public void deposit (double amount) {
//        synchronized (this) {
//            this.balance += amount;
//        }

//        lock.lock();
//        try {
//            this.balance += amount;
//        } finally {
//            lock.unlock();
//        }

        boolean status = false;
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                try {
                    this.balance += amount;
                    status = true;
                    System.out.println("Deposit of " + amount + " and the balance is now : " + this.balance);
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println("Couldn't get the lock");
            }
        } catch (InterruptedException e) {
            // do something
        }

        System.out.println("Transaction status = " + status);
    }

    public void withdraw (double amount) {
//        synchronized (this) {
//            this.balance -= amount;
//        }

//        lock.lock();
//        try {
//            this.balance -= amount;
//        } finally {
//            lock.unlock();
//        }

        boolean status = false;
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                try {
                    this.balance -= amount;
                    status = true;
                    System.out.println("Withdraw of " + amount + " and the balance is now : " + this.balance);
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println("Couldn't get the lock");
            }
        } catch (InterruptedException e) {
            // do something
        }

        System.out.println("Transaction status = " + status);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void printAccountNumber () {
        System.out.println("Account number = " + accountNumber);
    }
}
