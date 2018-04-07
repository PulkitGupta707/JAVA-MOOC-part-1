
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum=0;
        System.out.println("First :");
        int a=Integer.parseInt(reader.nextLine());
        System.out.println("Second :");
        int b=Integer.parseInt(reader.nextLine());
        while(a<=b)
        {
            sum=sum+a;
            
            a++;
        }
        System.out.println("The sum "+sum);
                
    }
}
