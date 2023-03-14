package test;
import javax.swing.plaf.synth.SynthSeparatorUI;

import enumTKB.*;
public class test {
   public static void main(String[] argv)
   {
      TKB t1 = new TKB(Ngay.Thứ_hai,Monhoc.Anh_văn);
      TKB t2 = new TKB(Ngay.Thứ_ba,Monhoc.Hóa);
    
        System.out.println("Thời khóa biểu");
      System.out.println(t1.toString());
      System.out.println(t2.toString());

      System.out.println(thang.thangbay.songay());
   }
}
