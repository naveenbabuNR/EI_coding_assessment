package Creational.Factory;

// NotificationFactory.java
public class NotificationFactory {
    public static Notification createNotification(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("EMAIL")) {
            return new EmailNotification();
        } else if (type.equalsIgnoreCase("SMS")) {
            return new SMSNotification();
        }
        return null;
    }
}
