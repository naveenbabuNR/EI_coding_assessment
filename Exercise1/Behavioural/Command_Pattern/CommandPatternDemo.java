package Behavioural.Command_Pattern;

import java.util.Scanner;


public class CommandPatternDemo {
    public static void main(String[] args) {
        Light light = new Light();

        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        RemoteControl remote = new RemoteControl();
        Scanner scanner = new Scanner(System.in);

        long startTime = System.currentTimeMillis();
        long duration = 5 * 60 * 1000; // Run for 5 minutes (300,000 milliseconds)

        while (System.currentTimeMillis() - startTime < duration) {
            System.out.println("Choose an option:");
            System.out.println("1 - Turn Light ON");
            System.out.println("2 - Turn Light OFF");
            System.out.println("3 - Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    remote.setCommand(lightOn);
                    remote.pressButton();
                    break;
                case 2:
                    remote.setCommand(lightOff);
                    remote.pressButton();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            // Optional: Pause for a short while to avoid excessive input prompts
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread was interrupted.");
            }
        }

        System.out.println("Time is up. Exiting...");
        scanner.close();
    }
}

