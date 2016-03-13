package carworkshop.executor;

import carworkshop.SchedulePrinter.SchedulePrinter;
import carworkshop.strategy.TaskExecutionStrategy;

import java.util.List;

/**
 * Created by maverick on 13/3/16.
 */
public class ScheduleExecutor {
    private List<Schedule> schedules;
    private TaskExecutionStrategy strategy;
    private SchedulePrinter printer;

    public ScheduleExecutor(List<Schedule> schedules, TaskExecutionStrategy strategy, SchedulePrinter printer) {
        this.schedules = schedules;
        this.strategy = strategy;
        this.printer = printer;
    }

    public void execute() throws InterruptedException {
        for (Schedule schedule : schedules) {
            Thread newThread = new Thread(new TaskExecutor(schedule, strategy, printer));
            newThread.start();
            newThread.join();
        }
    }
}
