package carworkshop.executor;

import carworkshop.employee.Employee;
import carworkshop.task.Task;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maverick on 13/3/16.
 */
public class Schedule {
    private Employee employee;
    private List<Task> tasks = new ArrayList<>();

    public Schedule(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void addTask(Task task) {
        this.tasks.add(task);
    }
}
