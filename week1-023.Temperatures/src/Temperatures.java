
import static java.lang.System.exit;
import java.util.Scanner;

public class Temperatures
{

    public static void main(String[] args)
    {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
         while (true) 
        {
            System.out.println("Enter the temperature");
            double number = Double.parseDouble(reader.nextLine());
            if(number>-30||number<40)
             {
                 Graph.addNumber(number);
             }
            else
                exit(0);
                
        }


      
    }
}
