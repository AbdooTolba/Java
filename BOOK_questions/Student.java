package BOOK_questions;

import sheetOOP.sheet;

public class Student extends Person {
    
    String x = "null";

    public Student(){
        super();
    }

    public Student(String x) {
        super();
        this.x = x;
    }


    final private String class_status = x;

    @Override
    public String toString() {
        return "Student" + this.getName();
    }
}
