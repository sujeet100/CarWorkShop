package carworkshop.strategy;

import carworkshop.executor.Schedule;
import carworkshop.task.Task;

import java.util.Collections;
import java.util.Comparator;

/**
 * Created by maverick on 13/3/16.
 */
public class TimePriorityStrategy implements TaskExecutionStrategy {
    @Override
    public Schedule execute(Schedule schedule) {
        Collections.sort(schedule.getTasks(), new Comparator<Task>() {
            @Override
            public int compare(Task t1, Task t2) {
                if(t1.getTimeTaken() < t2.getTimeTaken()){
                    return 1;
                } else if(t1.getTimeTaken() > t2.getTimeTaken()){
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        return schedule;
    }
}
