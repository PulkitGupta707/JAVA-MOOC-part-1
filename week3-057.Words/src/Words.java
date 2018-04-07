import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String word=null;
        do
        {
            System.out.println("Type a word: ");
            word=reader.nextLine();
            words.add(word);
            
        }
        while(!word.isEmpty());
        words.remove(words.size()-1);
        System.out.println("You typed the following words: ");
        for(String huehue:words)
        {
            System.out.println(huehue);
        }
                
    }
}
