package academy.learnprogramming;

import java.util.ArrayList;

public class Branch {
    private String nameBranch;
    private ArrayList<Customer> customers;

    // methods
    public void addCustomer (Customer customer) {
        if (!isExist(customer)) {
            this.customers.add(customer);
            customer.addTransactions(0);
            System.out.println("Customer " + customer.getName() + " added to the branch " + this.nameBranch +
                    " with an initial transaction of 0");
        } else {
            System.out.println("Customer " + customer.getName() + " already exists.");
        }
    }
    public void addTransactions (Customer customer, double transaction) {
        if (isExist(customer)) {
            customer.addTransactions(transaction);
            System.out.println("The transaction of " + transaction + " added for the customer " + customer.getName());
        } else {
            System.out.println("The customer " + customer.getName() + " does not exist in this branch " + this.nameBranch);
        }
    }

    public boolean isExist (Customer customer) {
        if (this.customers.indexOf(customer) >= 0) {
            return true;
        } else {
            for (int i = 0; i < this.customers.size(); i++) {
                if (customer.getName().equals(this.customers.get(i).getName())) {
                    return true;
                };
            }
            return false;
        }
    }

    // ______________________________________________________________________ //

    //constructor
    public Branch(String nameBranch) {
        this.nameBranch = nameBranch;
        this.customers = new ArrayList<Customer>();
    }

    //getters
    public String getNameBranch() {
        return nameBranch;
    }
    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    //setters
    public void setNameBranch(String nameBranch) {
        this.nameBranch = nameBranch;
    }
    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

}
