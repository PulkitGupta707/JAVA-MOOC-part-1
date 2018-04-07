public class Printing {

    public static void printStars(int amount) {
        int i;
             for(i=0;i<amount;i++)
             {
                System.out.print("*");
             }
             System.out.println();
            
       }

    public static void printSquare(int sideSize) {
        int j;
        for(j=0;j<sideSize;j++)
           
            printStars(sideSize);
          
        
    }

    public static void printRectangle(int width, int height) {
        
        int k,l;
        for(k=0;k<height;k++)
        
            printStars(width);
            
    }

    public static void printTriangle(int size) 
{
    int m;
    for(m=1;m<=size;m++)
    
        printStars(m);
    

}


    public static void main(String[] args) 
{
        
        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
}
}


