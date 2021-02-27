package lab10;

public class Test {

    public static void main(String[] args) {
        Account a1 = new Account(132, "Abdul", 5000);
        Account a2 = new Account(142, "Kader", 1000);
        Account a3 = new Account(152, "Sumit", 1500);
        Account a4 = new Account(162, "Shakib", 5000);

        Bank scb = new Bank(6);
        scb.addAccount(a1);
        scb.addAccount(a2);
        scb.addAccount(a3);
        scb.addAccount(a4);
        

        scb.printAccountInfo(132);
        System.out.println("Total Number of Accounts : " + scb.getNumOfAccount());
        System.out.println("Account information of all the accounts maintained by the bank ==>");
        
        Account[] accounts = scb.getAccounts();
        for (int i = 0; i < scb.getNumOfAccount(); i++) {
            System.out.println(accounts[i]);
        }
    }

}
