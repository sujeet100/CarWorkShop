package carworkshop.employee;

public class Employee {

    private String name;
    private Designation designation;

    public Employee(String name, Designation designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public Designation getDesignation() {
        return designation;
    }

}
