package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Bank bnp = new Bank("BNP");
        Bank lcl = new Bank("LCL");

        Branch toulouse = new Branch("Toulouse");
        Branch toulouse_Bis = new Branch("Toulouse");
        Branch bordeaux = new Branch("Bordeaux");
        Branch paris = new Branch("Paris");
        Branch lille = new Branch("Lille");

        Customer celine = new Customer("Celine");
        Customer joris = new Customer("Joris");
        Customer maman = new Customer("Maman");
        Customer grotoni = new Customer("Grotoni");

        bnp.addBranch(toulouse);
        bnp.addBranch(bordeaux);
        bnp.addBranch(toulouse_Bis);
        toulouse.addTransactions(celine, 0);
        toulouse.addCustomer(celine);
        celine.addTransactions(0);
        celine.addTransactions(3);
        celine.addTransactions(5);
        toulouse.addCustomer(maman);
        bnp.printCustomers(toulouse);

        lcl.addBranch(paris);
        lcl.addBranch(lille);
        lcl.addBranch(lille);
    }
}
