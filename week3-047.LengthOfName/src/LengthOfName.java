
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int x;
        System.out.println("Type your name: ");
        String name =reader.nextLine();
        x=calculateCharacters(name);
        System.out.println("Number of characters:"+x);
        // call your method from here
    }
    public static int calculateCharacters(String text)
    {
        
       return(text.length());
    }
    // do here the method
    // public static int calculateCharacters(String text)
    
}
