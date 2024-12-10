import java.util.*;
// n
// 1
public class booth
{
    public static int multiply(int n1, int n2)
    {
        int m = n1;
        int r = n2;
        int A = n1;
        int S = -n1;
        int P = 0;

        int count = Integer.SIZE;

        while(count > 0)
        {
            if((r & 1) == 1)
            {
                P += A;
                S += m;
            }
            A <<= 1;
            S <<= 1;
            count--;
            r >>= 1;
        }

        return P;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(multiply(n1, n2));
    }
}