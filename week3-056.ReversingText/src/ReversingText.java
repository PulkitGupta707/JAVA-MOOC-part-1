
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        String haxx="";
        int i;
         for(i=1;i<=text.length();i++)
        {
           haxx+=text.charAt(text.length()-i);
        }
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        return haxx;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
