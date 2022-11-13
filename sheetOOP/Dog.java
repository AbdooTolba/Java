package sheetOOP;

/**
 * Dog
 */
public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println("Woof");
    }
    
    void greets(Dog another) {
        System.out.println("Woooof");
    }
    
}