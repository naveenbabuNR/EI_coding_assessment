package Creational.Factory;

// SMSNotification.java
public class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an SMS Notification.");
    }
}
