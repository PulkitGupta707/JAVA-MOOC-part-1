
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int c=0;
        boolean win=false;
        while(win==false)
        {
            System.out.println("Guess a number: ");
         int n=reader.nextInt();
         c++;
        if(numberDrawn==n)
        {
            System.out.println("Congratulations, your guess is correct!");
            win=true;
        }
        else if(numberDrawn<n)
        {
            System.out.println("The number is lesser,guesses made:"+c);
            
        }
        
        else if(numberDrawn>n)
            System.out.println("The number is greater,guesses made:"+c);
        
        
        // program your solution here. Do not touch the above lines!
        }
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
