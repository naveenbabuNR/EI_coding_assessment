package Structural.Adapter;

// RectangleAdapter.java
public class RectangleAdapter implements Shape {
    private Rectangle rectangle;

    public RectangleAdapter(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    @Override
    public void draw() {
        rectangle.display(); // Adapted method
    }
}

