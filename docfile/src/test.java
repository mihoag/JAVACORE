import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] argv)
    {
        /*File f = new File("F:\\HK2_Nam2\\JAVA\\ghiFile\\src\\MinhHoang.txt");
        try{

        BufferedReader br = Files.newBufferedReader(f.toPath(),StandardCharsets.UTF_8);
        String line = null;
        while(true)
        {
            line = br.readLine();
            if(line == null)
            {
                break;
            }
            System.out.println(line);

        }
          }
          catch(IOException e)
{
    e.printStackTrace();
}*/
            // cach 2
            File f = new File("F:\\HK2_Nam2\\JAVA\\ghiFile\\src\\MinhHoang.txt");
            try
            {
                List<String> arr = Files.readAllLines(f.toPath(),StandardCharsets.UTF_8);
                for(String x : arr)
                {
                    System.out.println(x);
                }

            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
    }
}
