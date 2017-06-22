
public class PrimeNumberPattern {

    
    public static void main(String[] args) {
        System.out.println("1");
                System.out.println("12");
     for(int i=1;i<=6;i++)
     {
         for(int j=1;j<=i*3;j++)
         {
             int count=0;
              for(int k=2;k<=j-1;k++)
        {
                if(j%k==0)
                {
                    count++;
                    break;
                }
            }
            if(count==0)
            {
                System.out.print(j);
            }
         }
         System.out.println();
     }
    }
}
