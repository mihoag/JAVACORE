public class function
{
    public static void main(String[] argv)
    {
        String str = "Hello. I am Minh Hoang";
        System.out.println("Chieu dai chuoi : " + str.length()); // Ham lay chieu dai chuoi
        
        for(int i = 0 ; i < str.length() ; i++)
        {
            System.out.println("Ki tu thu " + i + " : " + str.charAt(i)); // ham xem ki tu tai vi tri i cua chuoi
        }
        //str.getChars(2, 6, 0, 5);
        System.out.println(str.hashCode());

        //
        //so sanh chuoi
        String s1 = "Hoang";
        String s2 = "HOANG";
        String s3 = "Hoang";
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        // so sanh dung compareto
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareToIgnoreCase(s2));

        // So khop chuoi
        String a1 = "Xin chao ! How are you?";
        String a2 = "How";

        System.out.println(a1.regionMatches(1,s2,0,3));
        System.out.println(a1.indexOf(a2));
    }
}