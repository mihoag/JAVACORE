import java.io.FileWriter;
import java.io.IOException;
public class ghifile {
    public static void main(String[] argv)
    {
        try{
      FileWriter f1 = new FileWriter("filename.txt");
      f1.write("HEllo");
       f1.close();
      }
      catch(IOException e)
      {
        System.out.println("An error occurred.");
        e.printStackTrace(); 
      }
    }
}
