package Exercise2.AstronautScheduler;

public abstract class TaskObserver implements Observer {
    protected ScheduleManager manager;

    public TaskObserver(ScheduleManager manager) {
        this.manager = manager;
    }
}

