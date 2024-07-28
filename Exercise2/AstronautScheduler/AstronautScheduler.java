package Exercise2.AstronautScheduler;

import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class AstronautScheduler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScheduleManager scheduler = ScheduleManager.getInstance();

        // Main loop to keep the program running until the user chooses to exit
        while (true) {
            displayMenu();
            int choice = getValidMenuChoice(scanner);

            switch (choice) {
                case 1:
                    addTask(scanner, scheduler);
                    break;
                case 2:
                    removeTask(scanner, scheduler);
                    break;
                case 3:
                    scheduler.viewTasks();
                    break;
                case 4:
                    System.out.println("Exiting program. Have a great day!");
                    scanner.close();
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\nAstronaut Daily Schedule Organizer");
        System.out.println("1. Add Task");
        System.out.println("2. Remove Task");
        System.out.println("3. View Tasks");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    private static int getValidMenuChoice(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // Clear invalid input
            System.out.print("Enter your choice: ");
        }
        return scanner.nextInt();
    }

    private static void addTask(Scanner scanner, ScheduleManager scheduler) {
        scanner.nextLine(); // Consume newline 
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();

        LocalTime startTime = getValidTimeInput(scanner, "Enter start time (HH:mm): ");
        LocalTime endTime = getValidTimeInput(scanner, "Enter end time (HH:mm): ");

        // Validate that the end time is after the start time
        while (endTime.isBefore(startTime) || endTime.equals(startTime)) {
            System.out.println("End time must be after the start time. Please enter a valid end time.");
            endTime = getValidTimeInput(scanner, "Enter end time (HH:mm): ");
        }

        String priority = getValidPriorityInput(scanner);
        Task newTask = new Task(description, startTime, endTime, priority);

        if (scheduler.addTask(newTask)) {
            System.out.println("Task added successfully.");
        }
    }

    private static void removeTask(Scanner scanner, ScheduleManager scheduler) {
        scanner.nextLine(); // Consume newline
        System.out.print("Enter task description to remove: ");
        String description = scanner.nextLine();
        scheduler.removeTask(description);
    }

    private static LocalTime getValidTimeInput(Scanner scanner, String prompt) {
        LocalTime time = null;
        while (time == null) {
            System.out.print(prompt);
            String timeString = scanner.nextLine();
            try {
                time = LocalTime.parse(timeString, DateTimeFormatter.ofPattern("HH:mm"));
            } catch (DateTimeParseException e) {
                System.out.println("Invalid time format. Please use HH:mm (e.g., 09:00).");
            }
        }
        return time;
    }

    private static String getValidPriorityInput(Scanner scanner) {
        while (true) {
            System.out.print("Enter task priority (High/Medium/Low): ");
            String priority = scanner.nextLine().toUpperCase();
            if (priority.equals("HIGH") || priority.equals("MEDIUM") || priority.equals("LOW")) {
                return priority;
            } else {
                System.out.println("Invalid priority level. Please enter High, Medium, or Low.");
            }
        }
    }
}

