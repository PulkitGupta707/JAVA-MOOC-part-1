
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int index;
        System.out.println("Type the first word: ");
        String word=reader.nextLine();
        System.out.println("Type the second word: ");
        String word1=reader.nextLine();
        index=word.indexOf(word1);
        if(index==-1)
            System.out.println("The word '"+word1+"' is not found in the word '"+word+"' .");
        else
            System.out.println("The word '"+word1+"' is found in the word '"+word+"' .");
        
        
    }
}
