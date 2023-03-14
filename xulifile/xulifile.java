import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class xulifile
{
    public static void main(String[] argv)
    {
      try{
          File f = new File("filename.txt");
          if(f.createNewFile()) // Hàm tạo file
          {
            System.out.println("Create success");
          }
          else
          {
            System.out.println("Existed");
          }
      }
      catch(IOException e)
      {
        System.out.println("Error Occured");
        e.printStackTrace();
      }

    }
}