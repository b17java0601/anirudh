class parent
{
    int x;
    parent()
    {
        System.out.println("Parent constructor");
        x=10;
    }
    void disp()
    {
        System.out.println("This is parent class method "+x);
    }
}
class child extends parent
{
    int y;
    child()
    {
        System.out.println("Child constructor");
        y=20;
    }
    void show()
    {
        disp();
        System.out.println("This is child class method "+x+" "+y);
    }
}

public class Inheritance {
    public static void main(String[] args)
    {
        child c=new child();
        c.show();
    }
}