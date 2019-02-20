package ClassStudy;

public class BankApp {

    public static void main(String[] args) {

        Customer customer = new Customer("Kosan",1996);
        BankAcount acc = new BankAcount("ACC001",500.00,customer);



        System.out.println(acc.getInfo());
        acc.deposit(  10000.00);
        System.out.println(acc.getInfo());
        acc.withdraw(7000.00);
        System.out.println(acc.checkBalance());

    }
}
