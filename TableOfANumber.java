
import java.util.Scanner;


public class TableOfANumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,i,v;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number:");
        n=s.nextInt();
         System.out.println("the table is :");
        for(i=1;i<=10;i++)
        {
            v=n*i;
            System.out.println(n+"*"+i+"="+v);
        }
        
    }
    
}
