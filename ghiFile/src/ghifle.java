import java.io.IOException;
import java.io.PrintWriter;

public class ghifle
{
    public static void main(String[] argv)
    {
    try{
       PrintWriter pw = new PrintWriter("F:\\HK2_Nam2\\JAVA\\ghiFile\\src\\MinhHoang.txt","UTF-8");
       pw.println("Minh Hoang");
       pw.println(14);
       pw.println('r');
       
       sinhvien s = new sinhvien("21120457", "Minh Hoang", 10);
       pw.println(s);

       pw.flush();
       pw.close();
    }
    catch(IOException e)
    {
        e.printStackTrace();
    }
}
}