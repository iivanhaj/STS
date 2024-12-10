import java.util.*;
// min(log(a,b))
//1
public class euclid
{
    public static int euclid(int a, int b)
    {
        if(b==0)
        {
            return a;
        }

        return euclid(b, a%b);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(euclid(a, b));
    }
}