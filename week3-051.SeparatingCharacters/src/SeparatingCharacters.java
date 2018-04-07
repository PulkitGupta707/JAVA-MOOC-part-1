
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i;
         System.out.println("Type your name: ");
        String name=reader.nextLine();
        for(i=1;i<=name.length();i++)
        {
            System.out.println(i+". character: "+name.charAt(i-1));
        }
    }
}
