package academy.learnprogramming;

public class DeluxeBurger extends Hamburger {

    //constructor
    public DeluxeBurger(String name, String typeOfProtein) {
        super(name, typeOfProtein);
        setAdditionsList("Chips and drinks");
        setBasicPrice(8.5);
    }

    @Override
    public void addAddition(String addition) {
        System.out.println("You can't add addition to your " + this.getName() + ", chips and drinks are included");
    }

    public void setBasicPrice(double priceDeluxe) {
        super.setBasicPrice(priceDeluxe);
    }
}
