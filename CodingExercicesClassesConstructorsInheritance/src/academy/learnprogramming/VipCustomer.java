package academy.learnprogramming;

public class VipCustomer {
    private String name;
    private int creditLimit;
    private String email;

    public VipCustomer () {
        this.name = "Name";
        this.creditLimit = 0;
        this.email = "";
    }
    public VipCustomer (String name, int creditLimit) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = "";
    }
    public VipCustomer (String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName () {
        return this.name;
    }
    public int getCreditLimit () {
        return this.creditLimit;
    }
    public String getEmail () {
        return this.email;
    }


}
