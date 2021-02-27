
package lab7;

public class Account {
    private int accountNumber;
    private double balance;
    
    public Account(int accountNumber){
        this.accountNumber = accountNumber;
    }
    
    public Account(int accountNumber,double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    
    public void credit(double amount){
        balance = balance + amount;
    }
    void debit(double amount){
        if(this.balance>= amount){
            balance = balance - amount;
        }
        else{
            System.out.println("amount withdrawn exceeds the current balance");
        }
    }

    @Override
    public String toString() {
        return "A/C no: " + accountNumber + ", Balance: " + balance ;
    }
    
}
