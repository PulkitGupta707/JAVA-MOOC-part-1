
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        double y;
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the radius: ");
        int x=Integer.parseInt(reader.nextLine());
        y=(double)2*Math.PI*x;
        System.out.println("Circumference of the circle: "+y);

        // Program your solution here 
    }
}
