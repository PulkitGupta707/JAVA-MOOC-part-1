
public class Accounts {

    public static void main(String[] args) {
        Account matt= new Account("Matt's account",1000.0);
        Account acc = new Account("My account ",0.0);
        matt.withdrawal(100);
        acc.deposit(100);
        System.out.println(matt);
        System.out.println(acc);
        // Code in Account.Java should not be touched!
        // write your code here
    }

}
