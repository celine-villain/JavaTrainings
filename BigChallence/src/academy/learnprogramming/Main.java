package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Hamburger simpleBurger = new Hamburger("Premier Burger", "Meat");
        HealthyBurger healthyBurger = new HealthyBurger("Healthy burger","Fish");
        DeluxeBurger deluxeBurger = new DeluxeBurger("Deluxe burger", "Meat");

        simpleBurger.getBasicPrice();
        healthyBurger.getBasicPrice();
        deluxeBurger.getBasicPrice();

        simpleBurger.addAddition("Lettuce");
        simpleBurger.addAddition("Cheese");
        simpleBurger.addAddition("Tomato");
        simpleBurger.addAddition("Bacon");
        simpleBurger.addAddition("Onion");

        healthyBurger.addAddition("Lettuce");
        healthyBurger.addAddition("Cheese");
        healthyBurger.addAddition("Tomato");
        healthyBurger.addAddition("Bacon");
        healthyBurger.addAddition("Onion");
        healthyBurger.addAddition("Beans");
        healthyBurger.addAddition("Onion");

        deluxeBurger.addAddition("Onion");

        simpleBurger.bill();
        healthyBurger.bill();
        deluxeBurger.bill();
    }
}
