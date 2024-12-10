// n -> n(n+1)/2
// n
// 1

import java.util.*;

public class max_product
{
    public static int max_prod (int arr[])
    {
        int n = arr.length;

        int max = arr[0];
        int min = arr[0];
        int result = arr[0];

        for(int i = 1; i < n; i++)
        {
            if(arr[i] < 0)
            {
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(arr[i], max*arr[i]);
            min = Math.min(arr[i], min*arr[i]);

            result = Math.max(result, max);
        }

        return result;
    }

    public static void main(String ars[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println(max_prod(arr));
    }
}