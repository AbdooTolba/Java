package sheetOOP;

// public class Author string name  string email char gender, constructor, getters and setters
public class Author {
    
    public Author() {
    }

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    private String name;
    private String email;
    private char gender;

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return this.gender;
    }


    // tostring
    @Override
    public String toString(){
        return (name + " (" + gender + ") at " + email);
    }


    
}