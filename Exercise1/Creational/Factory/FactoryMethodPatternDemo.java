package Creational.Factory;

// FactoryMethodPatternDemo.java
public class FactoryMethodPatternDemo {
    public static void main(String[] args) {
        // Create different types of notifications using the factory
        Notification emailNotification = NotificationFactory.createNotification("EMAIL");
        emailNotification.notifyUser();

        Notification smsNotification = NotificationFactory.createNotification("SMS");
        smsNotification.notifyUser();
    }
}
