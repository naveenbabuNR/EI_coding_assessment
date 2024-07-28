package Structural.Decorator;

// DecoratorPatternDemo.java
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        // Create a basic coffee
        Coffee coffee = new CoffeeImpl();

        // Add milk to the coffee
        Coffee milkCoffee = new MilkDecorator(coffee);

        // Add sugar to the coffee with milk
        Coffee milkSugarCoffee = new SugarDecorator(milkCoffee);

        // Print the description and cost of the coffee
        System.out.println("Description: " + milkSugarCoffee.getDescription());
        System.out.println("Cost: $" + milkSugarCoffee.cost());
    }
}
