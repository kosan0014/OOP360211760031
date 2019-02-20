package ClassStudy;

public class BankAcount {
    private String id;
    private double balance;
    private Customer cus;

    public BankAcount(String id, double balance, Customer cus) {
        this.id = id;
        this.balance = balance;
        this.cus = cus;
    }
    public String getInfo() {
        return "[Acc ID: "+this.id+"name:"+cus.getName()+"Balance: "+this.balance+"]";
    }

    public String getId() {
        return id;
    }

    public double checkBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount; //balance = balance+amout;
    }
    public void withdraw(double amont) {
        this.balance -= amont; //balance = balance-amount
    }
    public Customer getCus() {
        return cus;
    }
    public void setCus(Customer cus) {
        this.cus = cus;
    }
}
