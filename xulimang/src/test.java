import java.util.Arrays;
// Ham reverse mang

public class test {
    // Ham reverse mang
    public static int[] reverse(int[] a)
    {
          int[] ans = new int[a.length];
          for(int i = 0 ; i < a.length; i ++)
          {
            ans[i] = a[a.length-1-i];
          }
          return ans;
    }
    public static void main(String[] argv)
  {
    int[] a = new int[] {3,4,1,2,8,6,9,5};
    System.out.println("Mang ban dau: " + Arrays.toString(a));
     
    Arrays.sort(a);
    System.out.println("Mang sau khi sap xep tang dan: " + Arrays.toString(a));

    // tim kiem
    System.out.println(Arrays.binarySearch(a,4));
    System.out.println(Arrays.binarySearch(a,-1));

    // Ham fill
     //Arrays.fill(a, 0);
    // System.out.println(Arrays.toString(a));
    
    // 
    int[] x = test.reverse(a);
    System.out.println(Arrays.toString(x));

     
  }    
}
