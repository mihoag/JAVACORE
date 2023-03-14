import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class datetime 
{
    public static void main(String[] argv)
    {
    // Xem ngay hien tai
    LocalDate obj1 = LocalDate.now();
    System.out.println(obj1);
    
    // xem gio hien tai
    LocalTime obj2 = LocalTime.now();
    System.out.println(obj2);

    // xem ngay va gio
    LocalDateTime obj3 = LocalDateTime.now();
    System.out.println(obj3);

    // Chinh format cho ngay va gio
    DateTimeFormatter obj4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    String str = obj3.format(obj4);
    System.out.println(str);

    }
}