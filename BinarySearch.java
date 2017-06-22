
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        float marks[]={23f,45f,56.67f,11,45f,88.50f};
        float t,a;
        Scanner s= new Scanner(System.in);
        
       
        for(int i=0;i<marks.length;i++)
        {
            for(int j=i+1;j<marks.length;j++)
            {
                if(marks[j]<marks[i])
                {
                    t=marks[i];
                    marks[i]=marks[j];
                    marks[j]=t;
                }
            }
        }
         for(float i:marks)
    { 
        System.out.println(i);}
        System.out.print("Enter an element you want to search: ");
        a=s.nextFloat();
        int mid = (marks.length)/2;
        if(a==marks[mid])
        {
            System.out.println("Number found at: "+mid+"th position");
        }
        if(a<marks[mid])
        {
            for(int i=0;i<mid;i++)
            {
                if(a==marks[i])
                {
                    System.out.println("Number found at: "+i+"th position");
                }
            }
        }
        else
        {
            for(int i=mid+1;i<marks.length;i++)
            {
                if(a==marks[i])
                {
                    System.out.println("Number found at: "+i+"th position");
                }
            }
        }   
    }
    }