

import static java.lang.Math.pow;
import java.util.Scanner;
public class Armstrong 
{
 public static void main(String[] args) 
        {
        int num,n;
        double r=0,i=0,sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter+ the number ");
        num=s.nextInt();
        n=num;
        while(num!=0)
        {
             num=num/10;
             i++;
        }
        num=n;
        while(num!=0)
        {
            r=num%10;
            sum=sum+pow(r,i);
            num=num/10;
        }
        if(n==sum)
        {
            System.out.println("palidraome");
        }
        else
            {
            System.out.println(" not palidraome");
        }
    }
    
}
