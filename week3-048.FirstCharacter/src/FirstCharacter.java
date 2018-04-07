import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        char a;
        System.out.println("Type your name: ");
        String name =reader.nextLine();
        a=firstCharacter(name);
        System.out.println("First character:"+a);
        
    }
    public static char firstCharacter(String text)
    {
    char word=text.charAt(0);
    return(word);
    }
}
