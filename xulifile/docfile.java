import java.util.Scanner;
import java.io.File;
//import java.io.IOException;
public class docfile {
    public static void main(String[] argv)
    {
   try {
    File f = new File("filename.txt");
    Scanner sc = new Scanner(f);
    while(sc.hasNextLine())
    {
        String s = sc.nextLine();
        System.out.println(s);
    }
   } catch (Exception e) {
    // TODO: handle exception
    e.printStackTrace();
   }
}
}
