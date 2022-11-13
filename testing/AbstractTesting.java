package testing;

/**
 * AbstractTesting
 */
abstract public class AbstractTesting {
    private int x;

    private double y;

    // methods are 2
    
    /*
        * first is concrete method which is the same as the one we all are used to eg:-
    */
        
    
    public int doubleX(){
        return x*x;
    }


    /* 
        * sec is the abstracted method which means it doesn't have a body, eg:-
    */

    public abstract int multiX();  // don't forget the ';'



    // setters and getters


    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    

}