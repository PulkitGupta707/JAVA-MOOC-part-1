import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
         String haxx="";
        int i;
         for(i=1;i<=text.length();i++)
        {
           haxx+=text.charAt(text.length()-i);
        }
         if(haxx.equals(text))
             return true;
         else
             return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
