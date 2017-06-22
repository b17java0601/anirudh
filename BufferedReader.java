import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
class Student
{
int roll_no;//instance variables
String name;
float marks;
static String course="Java";//static variable

InputStreamReader i=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(i);


void input()throws IOException
{
System.out.println("Enter name");
name=br.readLine();
System.out.println("Enter roll_no.");
roll_no=Integer.parseInt(br.readLine());
System.out.println("Enter marks");
marks=Float.parseFloat(br.readLine());
}
void display()
{
System.out.println("roll_no="+roll_no+"\n"+"name="+name+"\n"+"marks="+marks);
}
public static void main(String args[])throws IOException
{
Student s1=new Student();
s1.input();
Student s2=new Student();
s2.input();
Student s3=new Student();
s3.input();

s1.display();
s2.display();
s3.display();



}



}








