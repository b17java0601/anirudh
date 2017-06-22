
import java.util.Scanner;


 
public class Ragged_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int p,q,r;
        int num;
        Ragged_array a1=new Ragged_array();
        int a[][]=new int[3][];
        Scanner s1=new Scanner(System.in);
        Scanner s2=new Scanner(System.in);
        Scanner s3=new Scanner(System.in);
        System.out.print("enter the size of columns = ");
        p=s1.nextInt();
        q=s2.nextInt();
        r=s3.nextInt();
        a[0]=new int[p];
        a[1]=new int[q];
        a[2]=new int[r];
        System.out.println("enter the values");
        for(int i=0;i<a.length;i++)
        {
        System.out.println("enter the values of "+i+"th row ");
            for(int j=0;j<a[i].length;j++)
            {
                   a[i][j]=s1.nextInt(); 
                }
            }
        System.out.println("maximu element is : "+a1.max(a));
        }
    int max(int a[][])
    {
        int m=a[0][0];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if(a[i][j]>m)
                {
                    m=a[i][j];
                }
            }
        }
        return m;
        
    }
}

    

