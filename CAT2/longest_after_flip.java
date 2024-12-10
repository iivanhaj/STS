import java.util.*;
//log n
//log n
public class longest_1_flip
{
    publi static int find(int b)
    {
        String b = Integer.toBinaryString(b);
        int max = 0;
        int current = 0; 
        int prev = 0;

        for(char digit: b.toCharArray())
        {
            if(digit == '1')
            {
                count++;
            }
            else
            {
                max = Math.max(max,current+prev+1);
                prev = current;
                current = 0;
            }
        }
        max = Math.max(max,current+prev+1);
        return max;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        System.out.println(find(b));
    }
}