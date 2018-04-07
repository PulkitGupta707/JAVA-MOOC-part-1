import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
         int i;
         System.out.println("Type your name: ");
        String name=reader.nextLine();
        for(i=1;i<=name.length();i++)
        {
            System.out.print(name.charAt(name.length()-i));
        }
    }
}
