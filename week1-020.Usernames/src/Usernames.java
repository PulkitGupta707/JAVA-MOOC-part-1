
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your username: ");
        String n=reader.nextLine();
        System.out.println("Type your password: ");
        String n2=reader.nextLine();
        if(n.equals("alex")&&n2.equals("mightyducks"))
            System.out.println("You are now logged into the system! ");
        else if((n.equals("emily"))&&(n2.equals("cat")))
            System.out.println("You are now logged into the system! ");
        else
            System.out.println("Your username or password was invalid!");
    }
    
}
