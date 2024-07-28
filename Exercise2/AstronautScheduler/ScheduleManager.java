package Exercise2.AstronautScheduler;

import java.util.ArrayList;
import java.time.LocalTime;
import java.util.Comparator;

public class ScheduleManager {
    private static ScheduleManager instance;
    private ArrayList<Task> tasks;

    private ScheduleManager() {
        tasks = new ArrayList<>();
    }

    // Singleton - Ensure only one ScheduleManager exists
    public static ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    public boolean addTask(Task newTask) {
        if (isTimeSlotAvailable(newTask.getStartTime(), newTask.getEndTime())) {
            tasks.add(newTask);
            sortTasksByStartTime(); // Keep tasks sorted
            return true;
        } else {
            System.out.println("Error: Task overlaps with an existing task.");
            return false;
        }
    }

    public void removeTask(String description) {
        boolean taskRemoved = tasks.removeIf(task -> task.getDescription().equals(description));
        if (taskRemoved) {
            System.out.println("Task removed successfully.");
        } else {
            System.out.println("Error: Task not found.");
        }
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks scheduled for the day.");
        } else {
            for (Task task : tasks) {
                System.out.println(task.getStartTime() + " - " + task.getEndTime() +
                                   ": " + task.getDescription() + " [" + task.getPriority() + "]");
            }
        }
    }

    // Helper function to check for overlapping tasks
    private boolean isTimeSlotAvailable(LocalTime newStart, LocalTime newEnd) {
        for (Task existingTask : tasks) {
            if (newStart.isBefore(existingTask.getEndTime()) && newEnd.isAfter(existingTask.getStartTime())) {
                return false; // Overlap found
            }
        }
        return true; // No overlap
    }

    // Helper function to sort tasks by start time
    private void sortTasksByStartTime() {
        tasks.sort(Comparator.comparing(Task::getStartTime));
    }
}

