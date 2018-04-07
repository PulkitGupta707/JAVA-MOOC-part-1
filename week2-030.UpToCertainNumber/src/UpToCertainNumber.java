
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int x=1;
        System.out.println("Up to what number? ");
        int n=Integer.parseInt(reader.nextLine());
        while(n>=x)
        {
            System.out.println(x);
            x++;
        }
        
        // Write your code here
        
    }
}
