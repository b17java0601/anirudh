
package student;

import java.util.Scanner;


public class Student {

int roll_no;
String name;
float marks;
Scanner s=new Scanner(System.in);
void input()
{
    System.out.println("enter name = ");
    name=s.nextLine();
    System.out.println("enter roll no. = ");
    roll_no=s.nextInt();
    System.out.println("enter marks = ");
    marks=s.nextFloat();
}
void display()
{
    System.out.println("rollno. "+roll_no+"\n"+"name "+name+"\n"+"makrs "+marks);
}
    
    public static void main(String[] args) {
        Student s1=new Student();
        s1.input();
        Student s2=new Student();
        s2.input();
        Student s3=new Student();
        s3.input();
        
        
        s1.display();
        s2.display();
        s3.display();
        
        
        // TODO code application logic here
    }
    
}
