import java.util.Scanner;
import java.util.Stack;

public class test {
    public static void main(String[] argv)
    {
        Stack<Character> st = new Stack<Character>();
        // st.push(null) : them gia tri
        // st.pop() : lay gia tri , dong thoi xoa khoi stack
        // st.peek() : lay gia tri nhung khong xoa khoi stack
        // st.empty() kiem tra co rong hay khong
        // st.contains("x") kiem tra xem "x" co ton tai hay khong
     
        // vi du dao nguoc chuoi
        /*Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i = 0 ; i < s.length() ; i++)
        {
            st.push(s.charAt(i));
        }
        while(!st.isEmpty())
       {
        System.out.print(st.pop());
       }
*/
       // chuyen tu he thap phan sang he nhi phan
    Stack<Integer> st2 = new Stack<Integer>();
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    while(a > 0)
    {
        //System.out.println(a%2);
       st2.push(a%2);
       a = a/2;
    }
    
    while(!st2.isEmpty())
    {
     System.out.print(st2.pop());
    }



    }
}
