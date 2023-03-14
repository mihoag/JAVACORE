import java.util.HashMap;

public class hashmap
{
    public static void main(String[] argv)
    {
        HashMap<String,String> q = new HashMap<String, String>();
        // them vao hashmap
        q.put("VietNam", "Hanoi");
        q.put("USA","Washington");
        q.put("Duc","Berlin");
        q.put("Philippin","manila");
    
        // Lay danh sach key
    for(String i : q.keySet())
    {
        System.out.println(i);
    }
    // Lay danh sach value
    for(String i : q.values())
    {
        System.out.println(i);
    }   
}
}
/*
 Them phan tu: out
 Xoa phan tu theo khoa: remove()
 Xoa het danh sach : clear()
 Lay kich thuoc: size()
 

 */
