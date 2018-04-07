import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        int sum=0,c=0,even=0,odd=0;
        double avg=0;
        System.out.println("Type numbers ");
        while(true)
        {
        int n=reader.nextInt();
        if(n==-1)
        {
            System.out.println("Thank you and see you later!");
            break;
        }
        sum=sum+n;
       
        c++;
         avg=(double)sum/c;
        if(n%2==0)
            even++;
        else 
        odd++;
        }
            System.out.println("The sum is "+sum);
            System.out.println("How many numbers: "+c);
            System.out.println("Average: "+avg);
            System.out.println("Even numbers: "+even);
            System.out.println("Odd numbers: "+odd);
        

        
    }
}
