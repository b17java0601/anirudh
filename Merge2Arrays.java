
import java.util.Scanner;


public class Merge2Arrays {
    public static void main(String[] args) {
     
        int num;
        Ragged_array a1=new Ragged_array();
        int a[]=new int[10];
        int b[]=new int[10];
        int c[]=new int[10];
        Scanner s1=new Scanner(System.in);
        System.out.println("enter the values");
        for(int i=0;i<a.length;i++)
                {
                   a[i]=s1.nextInt(); 
                }
        for(int j=0;j<b.length;j++)
                {
                   b[j]=s1.nextInt();
                }
         for(int k=0;k<c.length;k++)
                {
                   c[k]=s1.nextInt(); 
                }
            }
        System.out.println("maximu element is : "+a1.max(a));
        }
    int merge(int a[],int b[],int c[])
    {
        c[]=a[i]+b[j];
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

    


        // TODO code application logic here
    }
    
}
