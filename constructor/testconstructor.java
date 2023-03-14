import java.util.*;

 class A
{
    public A()
    {
        logging();
    }
    public void logging()
    {
        System.out.print("A constructor");
    }
}

 class B extends A
{
    public B()
    {
        logging();
    }
    public void logging()
    {
        System.out.print("B constructor");
    }
   
}
public class testconstructor
{
    public static void main(String[] argv)
    {
        B test = new B();
    }
}