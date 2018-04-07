
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        long x;
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int number1 = Integer.parseInt(reader.nextLine());
        System.out.println();
        x=number+number1;
        System.out.println("Sum of the numbers: "+x);
        // Implement your program here. Remember to ask the input from user
    }
}
