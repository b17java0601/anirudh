
import java.util.Scanner;


public class Reverse {

   
    public static void main(String[] args) {
        int num,rev=0,n=0,j;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number ");
        num=s.nextInt();
        j=num;
        while(num!=0)
        {
            n=num%10;
            rev=rev*10+n;
            num=num/10;
        }
        System.out.println("the reverse of number "+j+" is "+rev);
    }
    
}
