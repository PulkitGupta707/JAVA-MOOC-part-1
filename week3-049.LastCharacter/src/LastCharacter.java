import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        char a;
        System.out.println("Type your name: ");
        String name =reader.nextLine();
        a=lastCharacter(name);
        System.out.println("First character:"+a);
        
    }
    public static char lastCharacter(String text)
    {
    char word=text.charAt(text.length()-1);
    return(word);
    }
        
    
}
