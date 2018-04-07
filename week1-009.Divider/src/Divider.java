
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        double x;
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int n=Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int n1=Integer.parseInt(reader.nextLine());
        x=(double)n/n1;
        System.out.println("Division: "+n+"/"+n1+"="+x);
        // Implement your program here. Remember to ask the input from user.
    }
}
