package BOOK_questions;

import java.sql.Date;

public class Employee extends Person{
    
    private String office;
    private int salary;
    private Date hired;

    public Employee(){
        super();
    }

    public Employee(String office, int salary, Date hired) {
        super();
        this.office = office;
        this.salary = salary;
        this.hired = hired;
    }


    public String getOffice() {
        return this.office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getHired() {
        return this.hired;
    }

    public void setHired(Date hired) {
        this.hired = hired;
    }


    @Override
    public String toString() {
        return "Employee" + this.getName();
    }


}
