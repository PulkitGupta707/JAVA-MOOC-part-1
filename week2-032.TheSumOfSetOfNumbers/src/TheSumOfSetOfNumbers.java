
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum=0;
        int i=1;
        System.out.println("Until what? ");
        int n=Integer.parseInt(reader.nextLine());
        while(i<=n)
        {
            sum=sum+i;
            i++;
        }
        System.out.println("Sum is "+sum);
        

    }
}
