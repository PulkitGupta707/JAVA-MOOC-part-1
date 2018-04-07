public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i;
             for(i=0;i<amount;i++)
             {
                System.out.print("*");
             }
             System.out.println();
            
       }
    public static void printWhitespaces(int amount) {
        int i;
        for(i=0;i<amount;i++)
            System.out.print(" ");
    }

    public static void printTriangle(int size) {
        int j,k;
        for(j=size-1,k=1;j>=0;j--,k++)
        {
            printWhitespaces(j);
            printStars(k);
        }
        
            
    }

    public static void xmasTree(int height) {
        int m,n,a,c,b=height-2;
        for(m=height-1,n=1;m>=0&&n<=(height*2)-1;m--,n+=2)
        {
         printWhitespaces(m);
         printStars(n);
         
        }
        for(a=0;a<2;a++)
        { printWhitespaces(b);
                printStars(3);
        }
    }
        
    
    

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }

}