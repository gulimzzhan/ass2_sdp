public class Main {
    public static void main(String[] args) {
        Coffee myCoffee = new Chocolate(new Sugar(new Milk(new Latte())));


        System.out.println("Order: " + myCoffee.getDescription());
        System.out.println("Cost: $" + myCoffee.cost());
    }
}