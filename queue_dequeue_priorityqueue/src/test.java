
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class test {
    // cac thao tac chinh la : offer, poll, peek
    // queue bao gom : arraylist, priority_queue
    public static  void main(String[] argv)
    {
    Queue<String> q = new LinkedList<String>();
    q.offer("Hoang");
    q.offer("Hoai");
    q.offer("Minh");
    q.offer("Hai");
    q.offer("Huong");
    while(true)
    {
        String name = q.poll();
        if(name == null)
        {
            break;
        }
       // System.out.println(name);
    }

     // priority queue
     Queue<String> q1 = new PriorityQueue<String>();
     q1.offer("Hoai");
     q1.offer("An");
     q1.offer("Khanh");
     q1.offer("Thu");
     q1.offer("Hien");
     
     while(!q1.isEmpty())
      {
        System.out.println(q1.poll());
      }


      // dqueue
      Deque<String> q2 = new ArrayDeque<String>();
      q2.offer("Hoang");
      q2.offerFirst("Hoai");
      q2.offerLast("Hung");
      
      while(!q2.isEmpty())
      {
        System.out.println(q2.poll());
      }


    }

   
    
}
