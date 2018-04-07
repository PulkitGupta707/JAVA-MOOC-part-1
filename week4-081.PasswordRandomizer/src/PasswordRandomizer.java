import java.util.Random;
import java.util.*;

public class PasswordRandomizer {
    int length;
    private Random random = new Random();
    char p;
    // Define the variables

    public PasswordRandomizer(int length) {
        this.length=length;
        this.p='\0';
        // Initialize the variable
    }

    public String createPassword() {
       StringBuilder sb = new StringBuilder(length);
        String c="abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<length;i++)
        {
             p=(char)c.charAt( random.nextInt(c.length()));
             sb.append(p);
        }
        
        
        // write code that returns a randomized password
        return sb.toString();
    }
}
