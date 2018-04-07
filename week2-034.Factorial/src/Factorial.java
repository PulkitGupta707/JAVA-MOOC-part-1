import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int f=1;
        int i=1;
        System.out.println("Type a number: ");
        int n=Integer.parseInt(reader.nextLine());
        while(i<=n)
        {
            f=f*i;
            i++;
        }
        System.out.println("Factorial is "+f);

    }
}
