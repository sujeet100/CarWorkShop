package carworkshop.executor;

import carworkshop.SchedulePrinter.SchedulePrinter;
import carworkshop.strategy.TaskExecutionStrategy;

/**
 * Created by maverick on 13/3/16.
 */
public class TaskExecutor implements Runnable {
    private Schedule schedule;
    private TaskExecutionStrategy strategy;
    private SchedulePrinter printer;

    public TaskExecutor(Schedule schedule, TaskExecutionStrategy strategy, SchedulePrinter printer){
        this.schedule = schedule;
        this.strategy = strategy;
        this.printer = printer;
    }
    @Override
    public void run() {
        printer.print(strategy.execute(schedule));
    }
}
