        import java.util.Scanner;
        public class Marks 
        {
        public static void main(String[] args) 
        {
        int marks;
        Scanner j=new Scanner(System.in);
        System.out.println("enter marks");
        marks=j.nextInt();
        if(marks<40)
        {
            System.out.print("is fail");
        }
        else if(marks>=40&&marks<50)
        {
            System.out.print("is average");
        }
        else if(marks>=50&&marks<70)
        {
            System.out.print("is good ");
        }
        else if(marks>=70&&marks<85)
        {
            System.out.print("is v good");
        }
        else if(marks>=85)
        {
            System.out.print("is excellent");
        }
        }             
        }