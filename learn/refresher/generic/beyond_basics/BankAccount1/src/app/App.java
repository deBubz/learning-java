package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        BankAccount myAcc = new BankAccount("accNum", 100);

        myAcc.deposit(-10);
        myAcc.withdraw(200);

        myAcc.deposit(50);
        myAcc.withdraw(150);
    }
}