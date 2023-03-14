import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
public class test {
    public static void copyAll(File f1, File f2)
    {
          try
          {
            Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);

          }
          catch(IOException e)
          {
            e.printStackTrace();
          }

          if(f1.isDirectory())
          {
            File[] mangcon = f1.listFiles();
            for(File x  : mangcon)
            {
            File f3 = new File(f2.getAbsolutePath() + "\\" + x.getName() );
            copyAll(x, f3);
            } 
          }
    }
    public static void main(String[] argv)
     {
        // rename
        File f1 = new File("F:\\HK2_Nam2\\JAVA\\rename_move_copyFle\\src\\minhhoang.txt");
        File f2 = new File("F:\\HK2_Nam2\\JAVA\\rename_move_copyFle\\src\\NhatHao.txt");

      // f2.renameTo(f1);

        // rename cach 2
        /* 
        try 
        {
            //Files.move(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
            Files.move(f1.toPath(),f2.toPath(),StandardCopyOption.REPLACE_EXISTING);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        */
        File f3 = new File("F:\\HK2_Nam2\\JAVA\\rename_move_copyFle\\src\\Fold1");/* 
        try{
            Files.move(f1.toPath(), f3.toPath(), StandardCopyOption.REPLACE_EXISTING);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
*/

        //  Ham copy

       File f4 = new File("F:\\HK2_Nam2\\JAVA\\rename_move_copyFle\\src\\Fold2");
       /* 
       try{
        Files.copy(f3.toPath(), f4.toPath(), StandardCopyOption.REPLACE_EXISTING);
       }
       catch(IOException e)
       {
        e.printStackTrace();
       }*/
       test.copyAll(f3, f4);



       //



        

     }
}
