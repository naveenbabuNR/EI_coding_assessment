package Creational.Singleton;

// Singleton.java
public class Singleton {
    // The single instance of the class
    private static Singleton instance;

    // Private constructor to prevent instantiation
    private Singleton() {
        // Initialization code
    }

    // Public method to provide access to the instance
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // Example method to demonstrate the functionality of the Singleton
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

