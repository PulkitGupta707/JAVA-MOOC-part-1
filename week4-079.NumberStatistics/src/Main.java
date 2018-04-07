import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();
        System.out.println("Type numbers: ");
          int k=Integer.parseInt(reader.nextLine()); 
        while(k!=-1)
        {
                stats.addNumber(k);
                if(k%2==0)
                even.addNumber(k);
                else if(k%2!=0)
                    odd.addNumber(k);
           k=Integer.parseInt(reader.nextLine()); 
           
           
        }
     /* stats.addNumber(3);
      stats.addNumber(5);
      stats.addNumber(1);
      stats.addNumber(2);*/

      //System.out.println("Amount: " + stats.amountOfNumbers());
       System.out.println("sum: " + stats.sum());
       System.out.println("sum of even: " + even.sum());
       System.out.println("sum of odd: " + odd.sum());
    }
}
