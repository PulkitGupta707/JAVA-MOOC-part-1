
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int result=0;
        System.out.println("Type a number");
        int n=reader.nextInt();
        while(n>=0)
        {
           result=result+(int)Math.pow(2,n);
           n--;
        }
        System.out.println("The result is "+result);
        

    }
}
