package academy.learnprogramming;

public class Hamburger {

    //fields
    private String name;
    private String typeOfBread;
    private String typeOfProtein;
    private double basicPrice;
    private double additionsPrice = 0;
    private String additionsList;
    private int countAdditions = 0;

    //constructor
    public Hamburger(String name, String typeOfProtein) {
        this.name = name;
        this.typeOfBread = "Bread roll type";
        this.typeOfProtein = typeOfProtein;
        setBasicPrice(5);
    }

    //getters
    public double getBasicPrice() {
        return basicPrice;
    }
    public double getAdditionsPrice() {
        return additionsPrice;
    }
    public String getAdditionsList() {
        return additionsList;
    }
    public int getCountAdditions() {
        return countAdditions;
    }
    public double getFinalPrice() {
        return this.basicPrice + this.additionsPrice;
    }
    public String getName() {
        return name;
    }

    //setters
    public void setBasicPrice(double basicPrice) {
        this.basicPrice = basicPrice;
    }
    public void setCountAdditions(int countAdditions) {
        this.countAdditions = countAdditions;
    }
    public void setAdditionsList(String addition) {
        this.additionsList = this.additionsList == null ? "-" + addition : this.additionsList + "\n-" + addition;
    }
    public void setTypeOfBread(String typeOfBread) {
        this.typeOfBread = typeOfBread;
    }

    //functions
    public void addAddition () {
        this.countAdditions += 1;
        this.additionsPrice += 0.5;
    }
    public void addAddition(String addition) {
        if (this.countAdditions < 4) {
            setAdditionsList(addition);
            addAddition();
            System.out.println(addition + " added to your " + this.name);
        } else {
            System.out.println("You can't add " + addition + ", you have already chosen your 4 additions");
        }
    }

    public void bill() {
        System.out.println("------------------Complete bill of your burger : " + this.getName() + "------------------");
        System.out.println("Basic price of " + getClass().getSimpleName() + " is " + this.basicPrice + "€");
        System.out.println("~~~~Additions list~~~~\n" + this.additionsList);
        System.out.println("You have " + this.countAdditions + " additions for " + this.name + " : " + this.additionsPrice + "€");
        System.out.println("Final price : " + this.getFinalPrice() + "€");
    }


}


