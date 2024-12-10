import java.util.*;

public class AliceAppleTree
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int apple = sc.nextInt();
        int count = 0, sum =0;
        while(sum<apple)
        {
            count++;
            sum += (12*count*count);
        }

        System.out.println((8*(count)));
    }
}