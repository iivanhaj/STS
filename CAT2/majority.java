//n^2
//nlogn
//n, 1

public class majority
{
    public static int majority(int[] nums)
    {
        int candidate = 0;
        int count = 0;

        for(int num: nums)
        {
            if(count == 0)
            {
                candidate = num;
                count = 1;
            }
            else if(candidate == num)
            {
                count++;
            }
            else
            {
                count--;
            }
        }

        int max_count = 0;
        for(int num: nums)
        {
            if(num == candidate)
            {
                max_count++;
            }
        }

        if(max_count > nums.length/2)
        {
            return candidate;
        }
        else
        {
            return -1;
        }
    }

    public static void main(String args[])
    {
        int arr[] = {1, 2, 3, 4, 5, 1, 1, 1, 1, 1};
        System.out.println(majority(arr));
    }
}