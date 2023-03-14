package test;
import sinhvien.SV;

public class test {
    public static void main(String[] argv)
    {
        SV s1 = new SV("Hoang",21120457,9.21);
        SV s2 = new SV("Hoai", 21120455, 9.0);

        System.out.println(s1.compareTo(s2));
    }
    
}
