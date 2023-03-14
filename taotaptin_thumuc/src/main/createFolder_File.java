package main;

import java.io.File;
import java.io.IOException;

public class createFolder_File {
    public static void main(String[] argv)
    {
        // Ham kiem tra xem thu muc co ton tai hay khong
    File folder = new File("F:\\HK2_Nam2\\JAVA\\constructor");
    System.out.println(folder.exists());

    // tao thu muc
    File folder1 = new File("F:\\HK2_Nam2\\JAVA\\constructor\\Hoang");
    folder1.mkdir();
    // Ham tao mot chuoi thu muc
    File folder2 = new File("F:\\HK2_Nam2\\JAVA\\constructor\\Hoang1\\Hoang2\\Hoang3\\Hoang4");
    folder2.mkdirs();

    // 
    File f1 = new File("MinhHoang.ppt");
    try
    {
        f1.createNewFile();
    }
    catch(IOException e)
    {
        e.printStackTrace();
    }

    File f2 = new File("MinhHoang.xls");
    try
    {
        f2.createNewFile();
    }
    catch(IOException e)
    {
        e.printStackTrace();
    }

    }
}
