package sheetOOP;

// class Employee int id and String firstName and String lastName and double salary and constructor and getter and setter and toString and raiseSalary and getAnnualSalary
/**
 * Employee
 */
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(int id, String firstName, String lastName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public Object raiseSalary(double percent) {
        return this.salary += this.salary * (percent / 100);
    }

    public double getAnnualSalary() {
        return this.salary * 12;
    }

    @Override
    public String toString() {
        return "Employee[id=" + this.id + ", name=" + this.getName() + ", salary=" + this.salary + "]";
    }

}