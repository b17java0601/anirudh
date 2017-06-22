
import java.util.Scanner;


public class PrimeOrNotPrime {

   
    public static void main(String[] args) {
          int count=0,n;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter any number: ");
        n=s.nextInt();
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                count++;
                break;
            }
        }
        if(count==0)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not prime");
        }
    }
    }
    
