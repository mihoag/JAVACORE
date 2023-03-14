import java.util.ArrayList;
import java.util.Iterator;

public class iterator
{

    public static void main(String[] argv)
    {
    ArrayList<Integer> q = new ArrayList<Integer>();
    q.add(1);
    q.add(8);
    q.add(5);
    q.add(3);
    q.add(7);
    q.add(2);
    q.add(6);
    q.add(10);
    q.add(0);
    q.add(11);

    Iterator<Integer> it = q.iterator();
    while(it.hasNext())
    {
        System.out.print(it.next() + " ");
    }
    

    // Su dung remove
    it = q.iterator();
    while(it.hasNext())
    {
         if(it.next() < 5)
         {
            it.remove();
         }
    }
    System.out.println(q);
}

}