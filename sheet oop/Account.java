
// class Account with string id, string name, int balance with defulat constrctur sets balance to 0 and constrctur with id, name, balance and get and set methods for all variables and credit and debit methods and transferTo method and toString method
public class Account {
    private String id;
    private String name;
    private int balance;
    
    public Account() {
        this.balance = 0;
    }
    
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getBalance() {
        return balance;
    }
    
    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    public int credit(int amount) {
        this.balance += amount;
        return this.balance;
    }
    
    public int debit(int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }
    
    public int transferTo(Account another, int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            another.balance += amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }
    
    public String toString() {
        return "Account[id=" + this.id + ", name=" + this.name + ", balance=" + this.balance + "]";
    }
}