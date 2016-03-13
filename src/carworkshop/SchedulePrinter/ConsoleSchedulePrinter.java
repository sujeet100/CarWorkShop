package carworkshop.SchedulePrinter;

import carworkshop.executor.Schedule;
import carworkshop.task.Task;

/**
 * Created by maverick on 13/3/16.
 */
public class ConsoleSchedulePrinter implements SchedulePrinter {
    @Override
    public void print(Schedule schedule) {
        for (Task task : schedule.getTasks()){
            System.out.print("\n"+schedule.getEmployee().getName());
            System.out.print("\t"+task.getName());
            System.out.print("\t"+task.getTimeTaken());
            System.out.print("\t"+task.getServiceFee());
        }
    }
}
