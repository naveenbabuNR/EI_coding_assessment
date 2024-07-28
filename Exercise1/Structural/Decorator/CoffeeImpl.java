package Structural.Decorator;

// CoffeeImpl.java
public class CoffeeImpl implements Coffee {
    @Override
    public String getDescription() {
        return "Coffee";
    }

    @Override
    public double cost() {
        return 5.00; // Base cost of coffee
    }
}

