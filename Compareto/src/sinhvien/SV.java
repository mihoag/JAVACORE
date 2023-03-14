package sinhvien;

public class SV implements Comparable<SV>{
   private String name;
   private int MSSV;
    private double diem;

    public SV(String name, int MSSV, double diem)
    {
        this.name = name;
        this.MSSV = MSSV;
        this.diem = diem;
    }
     
    public int compareTo(SV a)
    {
       return this.MSSV - a.MSSV;
    } 
}
