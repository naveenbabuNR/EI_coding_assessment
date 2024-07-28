package Structural.Adapter;

// AdapterPatternDemo.java
public class AdapterPatternDemo {
    public static void main(String[] args) {
        // Create an instance of Rectangle
        Rectangle rectangle = new Rectangle();

        // Create an adapter for the Rectangle
        Shape shape = new RectangleAdapter(rectangle);

        // Use the adapter to draw the shape
        shape.draw();
    }
}
