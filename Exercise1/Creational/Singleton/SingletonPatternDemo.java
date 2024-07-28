package Creational.Singleton;

// SingletonPatternDemo.java
public class SingletonPatternDemo {
    public static void main(String[] args) {
        // Get the only instance of Singleton
        Singleton singleton = Singleton.getInstance();

        // Call a method on the Singleton instance
        singleton.showMessage();
        
    }
}

