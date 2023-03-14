import java.util.LinkedList;
import java.util.Collections;
public class linkedlist
{
    public static void main(String[] argv)
    {
        LinkedList<String> q  = new LinkedList<String>();
        q.add("Hung");
        q.add("Hoang");

        //
        System.out.println(q);

        // them vao dau
        q.addFirst("Son");
        // Them vao cuoi
        q.addLast("An");
        //
        System.out.println(q);
        // 
        Collections.sort(q);
        System.out.println(q);

    }
}
/*
 các hàm trong LinkedList
 addFirst(), addLast(), removeFirst(), removeLast(), getFirst(), getLast()
 cac ham giong voi ArrayList
 */