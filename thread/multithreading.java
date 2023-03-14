public class multithreading extends Thread
{
    @Override
    public void run()
    {
        for(int i = 1 ; i < 5 ; i++)
          {
            System.out.println(i);
          
        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException e)
        {}
    }
    }
    public static void main(String[] argv) 
    {
        multithreading s1 = new multithreading();
        multithreading s2 = new multithreading();
        multithreading s3 = new multithreading();
        s1.start();
        s2.start();
        s3.start();

    }
}