import java.util.Scanner;

/**
 *
 * @author aniru
 */
public class FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,m,fact=1;
        Scanner s= new Scanner(System.in);
        System.out.println("enter the number");
        m=s.nextInt();
        for(n=1;n<=m;n++)
        {
            fact=fact*n;
        }
        System.out.println("the factorial is "+fact);
    }
    
}
