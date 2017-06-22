
import java.util.Scanner;
public class Sort {
public static void main(String[] args)
{
    float marks[]={23,45f,56.76f,11,45f,88.50f};
    float t;
    Scanner s=new Scanner(System.in);
    for(float i:marks)
    {
        System.out.println(i);
    }
    System.out.println("Sorted array:");
    for(int i=0;i<marks.length;i++)
    {
        for(int j=i+1;j<marks.length;j++)
        {
            if(marks[j]<marks[i])
            {
                t=marks[i];
                marks[i]=marks[j];
                marks[j]=t;
            } }}
    for(float i:marks)
    { 
        System.out.println(i);}
}
}