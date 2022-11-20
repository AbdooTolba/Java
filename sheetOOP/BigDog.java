package sheetOOP;

/**
 * BigDog
 */
public class BigDog extends Dog{

    public BigDog(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println("Wooow");
    }

    void greets(Dog another) {
        System.out.println("Woooooow");
    }

    void greets(BigDog another) {
        System.out.println("Wooooooooow");
    }


    
    
}