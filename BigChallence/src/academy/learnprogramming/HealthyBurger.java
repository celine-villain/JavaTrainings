package academy.learnprogramming;

public class HealthyBurger extends Hamburger {

    public HealthyBurger(String name, String typeOfProtein) {
        super(name, typeOfProtein);
        super.setTypeOfBread("Brown rye bread roll");
        super.setBasicPrice(7);
    }

    @Override
    public void addAddition(String addition) {
        if (this.getCountAdditions() < 6) {
            setAdditionsList(addition);
            addAddition();
            System.out.println(addition + " added to your " + this.getName());
        } else {
            System.out.println("You can't add " + addition + ", you have already chosen your 6 additions");
        }
    }


}
