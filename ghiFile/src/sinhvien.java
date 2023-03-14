public class sinhvien {
    
    private String MSSV;
    private String hoten;
    private double diem;

    public sinhvien(String MSSV, String hoten, double die)
    {
        this.MSSV = MSSV;
        this.hoten = hoten;
        this.diem = die;
    }
     
    public String toString()
    {
        return this.MSSV +  " " + this.hoten + " " + this.diem;
    }

}
