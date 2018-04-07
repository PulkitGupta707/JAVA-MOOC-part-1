public class Spruce {

    public static void main(String[] args) {
        int i,j,k=0,x=5;
        for(i=1;i<=5;++i,k=0)
        {
            for(j=1;j<x;++j)
            {
                System.out.print(" ");
            }
            x=x-1;
              for(int t = 1; t < i*2; t++)
                {
                  System.out.print("*");  
                }
            System.out.println();
        }
        System.out.println("    *");
    }

}
