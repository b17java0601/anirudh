class A
{
    int x;
    A(int a)
    {
        System.out.println("parent constructor");
    }
}
class B extends A
{
    int x;
    B(int a)
    {
        super(a);
                System.out.println("child constructor");

        a=20;        
               
    }
}
public class Super {

   
    public static void main(String[] args) {
        B b1=new B(20);
    }
    
}
