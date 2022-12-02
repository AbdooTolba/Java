package BOOK_questions;

public class Staff extends Employee{

    private String title;

    public Staff(){
        super();
    }

    public Staff(String title){
        super();
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff" + this.getName();
    }



}
