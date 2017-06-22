public class Swap_without_3rdvariable {

    public static void main(String[] args){

        int a=29,b=31;

        System.out.println("Before Swapping:");

        System.out.println("a:"+a);

        System.out.println("b:"+b);

        a=a+b;

        b=a-b;

        a=a-b;

        System.out.println("After Swapping:");

        System.out.println("a:"+a);

        System.out.println("b:"+b);   

    }

}