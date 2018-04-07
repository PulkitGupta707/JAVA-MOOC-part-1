import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int z;
        System.out.println("Type a word: ");
        String word=reader.nextLine();
        System.out.println("Length of the end part: ");
        int x=reader.nextInt();
        z=word.length()-x;
        System.out.println("Result: "+word.substring(z));
    }
}
