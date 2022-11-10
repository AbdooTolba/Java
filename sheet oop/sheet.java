/**
 * test
 */
public class sheet {

    public static void main(String[] args) {


        // أمسح الكومنت على حسب الكلاس اللي عايز يتم تجربته

        // testCircle();
        // testRectangle();
        // testEmployee();
        // testInvoiceItem();
        // testAccount();
        // testAuthor();
        // testBook();
        // testCylinder();
        
    }



    
    // function make 2 objects of Circle class first with radius 1 and second with radius 25 and print the area and circumference of each circle and then print both objects
    public static void testCircle() {
        Circle c1 = new Circle();
        Circle c2 = new Circle(25);
        
        System.out.println("Circle 1: " + c1);
        System.out.println("Circle 2: " + c2);
        
        System.out.println("Area of Circle 1: " + c1.getArea());
        System.out.println("Area of Circle 2: " + c2.getArea());
        
        System.out.println("Circumference of Circle 1: " + c1.getCircumference());
        System.out.println("Circumference of Circle 2: " + c2.getCircumference());
    }

    // function make 2 objects of rectanble class first with length and width 1 and second with height 25.5 and width 30.3 and print the area and perimeter of each rectangle and then print both objects
    public static void testRectangle() {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(25.5f, 30.3f);
        
        System.out.println("Rectangle 1: " + r1);
        System.out.println("Rectangle 2: " + r2);
        
        System.out.println("Area of Rectangle 1: " + r1.getArea());
        System.out.println("Area of Rectangle 2: " + r2.getArea());
        
        System.out.println("Perimeter of Rectangle 1: " + r1.getPerimeter());
        System.out.println("Perimeter of Rectangle 2: " + r2.getPerimeter());
    } 

    // function make 2 objects of employee class first with id 1 and firstName "John" and lastName "abraham" and salary 1000 and second with id 2 and firstName "Jack" and lastName "smith" and salary 2000 and print the details of each employee and then print both objects
    /**
     * 
     */
    public static void testEmployee() {
        Employee e1 = new Employee(1, "John", "abraham", 1000);
        Employee e2 = new Employee(2, "Jack", "smith", 2000);
        
        System.out.println("Salary of Employee 1: " + e1.getSalary());
        System.out.println("Salary of Employee 2: " + e2.getSalary());
        
        System.out.println("Annual Salary of Employee 1: " + e1.getAnnualSalary());
        System.out.println("Annual Salary of Employee 2: " + e2.getAnnualSalary());
        
        System.out.println("Raise Salary of Employee 1: " + e1.raiseSalary(10));
        System.out.println("Raise Salary of Employee 2: " + e2.raiseSalary(10));
        
        System.out.println("Annual Salary of Employee 1: " + e1.getAnnualSalary());
        System.out.println("Annual Salary of Employee 2: " + e2.getAnnualSalary());
        
        System.out.println("Employee 1: " + e1);
        System.out.println("Employee 2: " + e2);
        
    }

    // function make 2 objects of inoviceItem class first with id 1, desc "book" and qty 2 and price 100 and second with id 2, desc "pen" and qty 3 and price 50 and print the details of each invoice and then print both objects
    public static void testInvoiceItem() {
        InvoiceItem i1 = new InvoiceItem("1", "book", 2, 100);
        InvoiceItem i2 = new InvoiceItem("2", "pen", 3, 50);
        
        System.out.println("Total of Invoice Item 1: " + i1.getTotal());
        System.out.println("Total of Invoice Item 2: " + i2.getTotal());
        
        System.out.println("Invoice Item 1: " + i1);
        System.out.println("Invoice Item 2: " + i2);
        
    }

    // function make 2 objects of account class first with id 1, name "John" and balance 1000 and second with id 2, name "Jack" and balance 2000 use credit to add to object 1 500 and use transfer to transfer 100 from object 1 to object 2 and then print both objects
    public static void testAccount() {
        Account a1 = new Account("1", "John", 1000);
        Account a2 = new Account("2", "Jack", 2000);
        
        System.out.println("Account 1: " + a1);
        System.out.println("Account 2: " + a2);
        
        a1.credit(500);
        //  "after credit"
        System.out.println("Affter credit: ");
        System.out.println("Account 1: " + a1);
        
        a1.transferTo(a2, 100);
        System.out.println("Both affter transfer to: ");

        System.out.println("Account 1: " + a1);
        System.out.println("Account 2: " + a2);
    }
    // function make 2 objects of class author name tolba, email @mailna.com, gender 'm' and object 2 name Forqata  email @forqata.com, gender 'm' and print both objects
    public static void testAuthor() {
        Author a1 = new Author("tolba", "@mailna.com", 'm');
        Author a2 = new Author("Forqata", "@forqata.com", 'm');
        
        System.out.println("Author 1: " + a1);
        System.out.println("Author 2: " + a2);
    }

    // function make 2 objects of class book name "Java",author a1, price 100, qty 2 and object 2 name "C++", author a2,price 200, qty 5 and print both objects
    public static void testBook() {
        Author a1 = new Author("tolba", "@mailna.com", 'm');
        Author a2 = new Author("Forqata", "@forqata.com", 'm');
        
        Book b1 = new Book("Java", a1, 100, 2);
        Book b2 = new Book("C++", a2, 200, 5);
        
        System.out.println("Book 1: " + b1);
        System.out.println("Book 2: " + b2);
    }


    // function make 2 objects of class Clyinder radius 1.5 and height 2.5 and object 2 radius 8 and height 15.5 and print volume and both objects
    public static void testCylinder() {
        Cylinder c1 = new Cylinder(1.5f, 2.5f);
        Cylinder c2 = new Cylinder(8, 15.5f);
        
        System.out.println("Volume of Cylinder 1: " + c1.getVolume());
        System.out.println("Volume of Cylinder 2: " + c2.getVolume());
        
        System.out.println("Cylinder 1: " + c1);
        System.out.println("Cylinder 2: " + c2);
        
    }

}


