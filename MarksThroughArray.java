import java.util.Scanner;
public class MarksThroughArray 
{
public static void main(String[] args) {
int marks[];
marks=new int[10];
Scanner s=new Scanner(System.in);
System.out.println("enter marks of 10 students");
for(int i=0;i<marks.length;i++)
{
marks[i]=s.nextInt();
}
System.out.println("the marks are:");
for(int i=0;i<marks.length;i++)
{
System.out.println("the marks of "+i+" is "+marks[i]);
}
}
}
