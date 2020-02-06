package academy.learnprogramming;

import java.util.ArrayList;

public class Customer {
    private String nameCustomer;
    private ArrayList<Double> transactions;

    public void addTransactions (double transaction) {
        if (transaction != 0 ) {
            this.transactions.add(transaction);
            System.out.println("Transaction of " + transaction + " for " + this.nameCustomer + " done.");
        } else {
            System.out.println("Amount is null, transaction not added.");
        }
    }

    // ______________________________________________________________________ //

    //constructor
    public Customer(String name) {
        this.nameCustomer = name;
        this.transactions = new ArrayList<Double>();
    }

    //getters
    public String getName() {
        return nameCustomer;
    }
    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    //setters
    public void setName(String name) {
        this.nameCustomer = name;
    }
}