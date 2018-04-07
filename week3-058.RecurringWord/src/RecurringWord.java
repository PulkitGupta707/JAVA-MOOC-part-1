
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

   
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
          ArrayList<String> words = new ArrayList<String>();
          String a;
          boolean b=true;
         while(b)
        {
                System.out.println("Type a word: ");
            a=reader.nextLine();
           for(String word:words)
           {
            if(a.equals(word))
            {
                b=false;
                break;
            }
           }
            if(b)
                words.add(a);
            else
            {
                System.out.println("You gave twice the word "+a+"twice");
                break;
               
            }
            
        }    
    }
}
