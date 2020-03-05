package app;

/**
 * BankAccount
 */
public class BankAccount {

    private String accountNum;
    private double accountBal;

    public String getAccNum() { return this.accountNum; }
    public double getBal() { return this.accountBal;}

    public BankAccount (String accNum, double accBal){
        this.accountNum = accNum;
        this.accountBal = accBal;
    }

    private void newBalance(){
        System.out.println("Your new balance is $" + this.accountBal);
    }

    public void deposit(int amt) {
        if (amt <= 0) {
            System.out.println("Invalid deposit amt");
        }
        else {
            this.accountBal += amt;
            System.out.println("Successfully deposit $" + amt);
            this.newBalance();
        }
    }

    public void withdraw(int amt) {
        if (amt > this.accountBal) {
            System.out.println("Insufficient Fund");
        }   
        else {
            this.accountBal -= amt;
            System.out.println("Successfully withdraw $" + amt);
            this.newBalance();
        }
    }
}