import java.util.Scanner;
public class Fibonaacci {
   
    public static void main(String[] args) {
        int a=-1,b=1,c=0,n,m,sum=0;
        Scanner s=new Scanner(System.in);
        System.out.print("enter the number");
        m=s.nextInt();
        for(n=1;n<=m;n++)
        {
            
            c=a+b;
            sum=sum+c;
            a=b;
            b=c;
            
        }
      System.out.println("the sum of factorial is "+sum);
    }
    
}
