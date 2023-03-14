import java.sql.Date;
import java.util.Calendar;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
public class time {
    public static void main(String[] argv)
    {
long t1 = System.currentTimeMillis();
for(int i = 0 ; i < 1000 ; i++)
{
    System.out.println("hi");
}
long t2 = System.currentTimeMillis();
System.out.println(t2-t1); 
System.out.println(TimeUnit.HOURS.toSeconds(2));
System.out.println(TimeUnit.DAYS.toSeconds(1));

// Date
Date q = new Date(System.currentTimeMillis());
//System.out.println(q.getDate() + "/" + (q.getMonth()+1) );

// calendar
Calendar c = Calendar.getInstance();
//System.out.println(c.get(Calendar.DATE) + "/" + (c.get(Calendar.MONTH)+1) + "/" + c.get(Calendar.YEAR));

c.add(Calendar.DATE,10);
System.out.println(c.get(Calendar.DATE) + "/" + (c.get(Calendar.MONTH)+1) + "/" + c.get(Calendar.YEAR));
}    
}
