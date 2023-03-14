import java.io.File;
public class deleteFile {

    // Xoa thu muc co chua tap tin va thu muc con
    public static void deletefile(File f)
    {
        // Neu la tap tin thi xoa
       if(f.isFile() )
         {
            System.out.println("Xoa " + f.getAbsolutePath());
            f.delete();
         }
         else if(f.isDirectory()) // neu la thu muc thi thuc hien lay nhung file ben trong va tiep tuc de quy
         {
            File[] mang = f.listFiles();
            
            for(File x : mang)
            {
               deletefile(x);
            }
         }
         // xoa thu muc rong
         f.delete();
    }
    public static void main(String[] argv)
    {
        File f1 = new File("F:\\HK2_Nam2\\JAVA\\deleteFile\\src\\Fold1\\Fold2\\Fold3\\minhhoang.txt");
        File f2 = new File("F:\\HK2_Nam2\\JAVA\\deleteFile\\src\\Fold1\\Fold2\\Fold3");
        File f3 = new File("F:\\HK2_Nam2\\JAVA\\deleteFile\\src\\Fold1\\Fold2");
        File f4 = new File("F:\\HK2_Nam2\\JAVA\\deleteFile\\src\\Fold1");
        /* 
        System.out.println(f1.exists());
        System.out.println(f2.exists());
        System.out.println(f3.exists());
        System.out.println(f4.exists());
        */


        //f4.deleteOnExit();
        /*f1.deleteOnExit(); // Dung deleteOnExit de xoa ma hong bao loi khi thu muc khong xoa duoc
        f2.deleteOnExit();
        f3.deleteOnExit();
        f4.deleteOnExit();
        */
           
        deleteFile.deletefile(f4);
    }
}
