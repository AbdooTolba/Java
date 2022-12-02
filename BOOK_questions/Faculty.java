package BOOK_questions;

public class Faculty extends Employee{

    public Faculty(){
        super();
    }

    public Faculty(float office_hours, String rank) {
        super();
        this.office_hours = office_hours;
        this.rank = rank;
    }

    private float office_hours;
    private String rank;


    public float getOffice_hours() {
        return this.office_hours;
    }

    public void setOffice_hours(float office_hours) {
        this.office_hours = office_hours;
    }

    public String getRank() {
        return this.rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    
    @Override
    public String toString() {
        return "Faculty" + this.getName();
    }


    
}
