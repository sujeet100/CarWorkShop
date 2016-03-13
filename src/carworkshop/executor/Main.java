package carworkshop.executor;

import carworkshop.SchedulePrinter.ConsoleSchedulePrinter;
import carworkshop.employee.Designation;
import carworkshop.employee.Employee;
import carworkshop.strategy.ServiceFeeStrategy;
import carworkshop.task.CarPaint;
import carworkshop.task.CarRepair;
import carworkshop.task.CarWash;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maverick on 13/3/16.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Employee joe = new Employee("Joe", Designation.Trainee);
        Employee smith = new Employee("Smith", Designation.Expert);
        Employee walker = new Employee("Walker", Designation.Employee);

        List<Schedule> schedules = new ArrayList<>();

        Schedule joeSchedule = new Schedule(joe);
        joeSchedule.addTask(CarWash.getInstance());
        joeSchedule.addTask(CarRepair.getInstance());
        joeSchedule.addTask(CarPaint.getInstance());

        Schedule smithSchedule = new Schedule(smith);
        smithSchedule.addTask(CarRepair.getInstance());

        Schedule walkerSchedule = new Schedule(walker);
        walkerSchedule.addTask(CarPaint.getInstance());
        walkerSchedule.addTask(CarRepair.getInstance());

        schedules.add(joeSchedule);
        schedules.add(smithSchedule);
        schedules.add(walkerSchedule);

        ScheduleExecutor scheduleExecutor = new ScheduleExecutor(schedules, new ServiceFeeStrategy(), new ConsoleSchedulePrinter());
        scheduleExecutor.execute();


    }
}
