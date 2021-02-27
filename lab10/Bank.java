package lab10;

public class Bank {

    private Account[] accounts;
    private int numOfAccount;

    public Bank(int size) {
        accounts = new Account[size];
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setNumOfAccount(int numOfAccount) {
        this.numOfAccount = numOfAccount;
    }

    public int getNumOfAccount() {

        return numOfAccount;
    }

    public void addAccount(Account account) {
        accounts[numOfAccount] = account;
        numOfAccount++;

    }

    public void printAccountInfo(int accountNumber) {
        for (int i = 0; i < numOfAccount; i++) {
            if (accounts[i].getAccountNumber() == accountNumber) {
                System.out.println(accounts[i].toString());
            }
        }
    }
}
