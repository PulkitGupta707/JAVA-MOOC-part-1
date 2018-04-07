
public class Accounts {

    public static void main(String[] args) {
         Account x = new Account("A",100);
         Account y = new Account("B",0);
         Account z = new Account("c",0);
        transfer(x,y,50);
        transfer(y,z,25);
        
         
// Code in Account.Java should not be touched!
        // write your code here
    }
     public static void transfer(Account from, Account to, double howMuch)
     {
         from.withdrawal(howMuch);
         to.deposit(howMuch);
     }


}
