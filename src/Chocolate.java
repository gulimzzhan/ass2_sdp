public class Chocolate extends CoffeeDecorator {
    public Chocolate(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Chocolate";
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.7;
    }
}