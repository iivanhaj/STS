import java.util.*;

public class EulerPhiAlgorithm
{
    public static int phi(int n)
    {
        int result = n;

        for(int p =2;  p*p <=n; p++)
        {
            if(n%p == 0)
            {
                while(n%p == 0)
                {
                    n /= p;
                }
                result -= result/p;
            }
        }

        if(n > 1)
        {
            result -= result/n;
        }

        return result;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Euler's Totient Function for " + n + " is " + phi(n));
    }
}