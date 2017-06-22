
import java.util.Scanner;
public class FibonacciTillValueN {

   
        public static void main(String[] args) {
        int a=-1,b=1,c=0,n,m,sum=0;
        Scanner s=new Scanner(System.in);
        System.out.print("enter the number ");
        m=s.nextInt();
        while(c<=m)
        {
        c=a+b;
        if(c<=m)
        {
        sum=sum+c;
        a=b;
        b=c;
        }
        }
        System.out.println("the sum of factorial is "+sum);
        }
        }
    

