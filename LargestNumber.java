
import java.util.Scanner;


public class LargestNumber {

   
    public static void main(String[] args) {
    float num[]={23,45f,56.76f,11,45f,88.50f};
    float t;
    Scanner s=new Scanner(System.in);
    for(float i:num)
    {
        System.out.println(i);
    }
    System.out.println("the largest number is :");
    for(int i=0;i<num.length;i++)
    {
        for(int j=i+1;j<num.length;j++)
        {
            if(num[j]<num[i])
            {
                t=num[i];
                num[i]=num[j];
                num[j]=t;
            } }}
    
System.out.println(num[num.length-1]);}
    }
     
    
    

