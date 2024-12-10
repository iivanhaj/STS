import java.util.*;

public class longest_1
{
    publi static int find(int b)
    {
        String b = Integer.toBinaryString(b);
        int count = 0;
        int max = 0;

        for(char digit: b.toCharArray())
        {
            if(digit == '1')
            {
                count++;
                if(count > max)
                {
                    max = count;
                }
            }
            else
            {
                count = 0;
            }
        }
        return max;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        System.out.println(find(b));
    }
}