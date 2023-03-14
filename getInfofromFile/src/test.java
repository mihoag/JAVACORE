import java.io.File;
import java.util.Scanner;

public class test {
    
    public static void main(String[] argv)
    {
        //int luachon = 0 ;
        //Scanner sc = new Scanner(System.in);
        //String name = sc.nextLine();
        File f = new File("F:\\HK2_Nam2\\JAVA\\getInfofromFile\\src\\minhhoang");
        System.out.println(f.exists());
        System.out.println(f.isDirectory());

        System.out.println("co the thuc thi : " + f.canExecute());
        System.out.println("co the doc : " + f.canRead());
        System.out.println("co the viet : " + f.canWrite());
        System.out.println("Lay duong dan : " + f.getAbsolutePath());
        System.out.println("is file  : " + f.isFile());
        System.out.println("Is dir : " + f.isDirectory());

        File[] mang  = f.listFiles();
        for(File x : mang)
        {
            System.out.println(x.getAbsolutePath());
        }
        
    }
}
