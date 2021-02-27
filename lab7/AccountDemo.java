package lab7;

public class AccountDemo {

    public static void main(String[] args) {
        Account a1 = new Account(132);
        System.out.println(a1);

        a1.credit(5000);
        System.out.println(a1);
        
        a1.debit(2000);
        System.out.println(a1);

    }
}
