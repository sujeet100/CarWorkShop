package carworkshop.strategy;

import carworkshop.executor.Schedule;

/**
 * Created by maverick on 13/3/16.
 */
public interface TaskExecutionStrategy {
    public Schedule execute(Schedule schedule);
}
