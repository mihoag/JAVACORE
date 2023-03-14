package enumTKB;

public class TKB {
    private Ngay ngay;
    private Monhoc monhoc;

    public TKB()
    {}
    public TKB(Ngay ngay, Monhoc monhoc)
    {
        this.ngay =  ngay;
        this.monhoc = monhoc;
    }

    public String toString()
    {
        return this.ngay + ": " + this.monhoc;
    }
}
