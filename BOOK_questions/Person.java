package BOOK_questions;


public class Person {


    public Person() {
        super();
    }


    public Person(String name, String address, int phone_number, String email_address) {
        super();
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
        this.email_address = email_address;
    }



    private String name;
    private String address;
    private int phone_number;
    private String email_address;



    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone_number() {
        return this.phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail_address() {
        return this.email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }


    @Override
    public String toString() {
        return name;
    }

}
