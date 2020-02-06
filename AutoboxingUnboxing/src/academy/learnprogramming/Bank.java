package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Currency;

public class Bank {
    private String nameBank;
    private ArrayList<Branch> branches;

    // methods

    public void addBranch (Branch branch) {
        if (!isExist(branch)) {
            this.branches.add(branch);
            System.out.println(branch.getNameBranch() + " added for the bank " + this.nameBank);
        } else {
            System.out.println("The branch " + branch.getNameBranch() + " already exists.");
        }

    }
    public void addCustomer (Branch branch, Customer customer) {
        if (isExist(branch) && branch.isExist(customer)) {
            branch.addCustomer(customer);
        } else if (isExist(branch) && !branch.isExist(customer)) {
            System.out.println("The customer " + customer.getName() + " does not exist in this branch " + branch.getNameBranch());
        } else if (!isExist(branch) && branch.isExist(customer)) {
            System.out.println("The branch " + branch.getNameBranch() + " does not exist for this bank " + this.nameBank);
        } else {
            System.out.println("The branch " + branch.getNameBranch() + " does not exist for this bank " + this.nameBank);
        }
    }
    public void addTransaction (Branch branch, Customer customer, double transaction) {
        branch.addTransactions(customer, transaction);
    }
    public void printCustomers (Branch branch) {
        if (isExist(branch)) {
            System.out.println("List of customers of the branch " + branch.getNameBranch());
            ArrayList<Customer> customer = branch.getCustomers();
            for (int i = 0; i < branch.getCustomers().size(); i++) {
                System.out.println(" - " + customer.get(i).getName());
            }
        } else {
            System.out.println("The branch " + branch.getNameBranch() + " does not exist for this bank " + this.nameBank);
        }

    }

    public boolean isExist (Branch branch) {
        if (this.branches.indexOf(branch) >= 0) {
            return true;
        } else {
            for (int i = 0; i < this.branches.size(); i++) {
                if (branch.getNameBranch().equals(this.branches.get(i).getNameBranch())) {
                    return true;
                };
            }
            return false;
        }
    }

    // ______________________________________________________________________ //

    //constructor
    public Bank(String nameBank) {
        this.nameBank = nameBank;
        this.branches = new ArrayList<Branch>();
    }

    //getters
    public String getNameBank() {
        return nameBank;
    }
    public ArrayList<Branch> getBranches() {
        return branches;
    }

    //setters
    public void setNameBank(String nameBank) {
        this.nameBank = nameBank;
    }
    public void setBranches(ArrayList<Branch> branches) {
        this.branches = branches;
    }

}
