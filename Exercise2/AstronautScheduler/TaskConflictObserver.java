package Exercise2.AstronautScheduler;

public class TaskConflictObserver extends TaskObserver {
    public TaskConflictObserver(ScheduleManager manager) {
        super(manager);
    }

    @Override
    public void update(String message) {
        System.out.println("Task Conflict Notification: " + message);
    }
}

