import java.util.*;
//log n
// 1
public class binary_palindrome
{
    public static boolean isPalindrome(int x)
    {
        int reversed = 0;
        int original = x;
        while (x > 0)
        {
            reversed <<= 1;
            reversed |= (x & 1);
            x >>= 1; 
        }

        return reversed == original;
    }
    /*
    class geek {
    // driver code
    public static void main(String[] args)
        {
            gfg g = new gfg();
            int n = 32;
            System.out.println("Decimal - " + n);
            System.out.print("Binary - ");
            g.decToBinary(n);
        }
    }
    */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(isPalindrome(x))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}