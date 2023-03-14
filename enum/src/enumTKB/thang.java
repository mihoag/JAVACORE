package enumTKB;
public enum thang
{
   thangmot(31),
   thanghai(29),
   thangba(31),
   thangtu(30),
   thangnam(31),
   thangsau(30),
   thangbay(31),
   thangtam(31),
   thangchin(30),
   thangmuoi(31),
   thangmuoimot(30),
   thangmuoihai(31);

   public final int songay;
   thang(int songay) // khoi tao khong dung public, private, hay protected
   {
    this.songay = songay;
   }
   public int songay()
   {
    return this.songay;
   }


}