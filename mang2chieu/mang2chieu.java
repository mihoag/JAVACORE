import java.util.*;
public class mang2chieu {
    public static float[][] init2Array (int n, int m)
    {
        float [][] a;
        a = new float [n][m];
        for(int i = 0; i < n ; i++)
        {
            for(int j = 0; j < m ; j++)
                 {
                    a[i][j] = i*j;
                 }
        }
        return a;
    }
    public static void display(float a[][])
    {
        int n = a.length;
        int m = a[0].length;
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < m ; j++)
            {
              System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
     public static void main(String[] argv)
     {
        float[][] a = init2Array(2, 3);
        display(a);
     }  
}
