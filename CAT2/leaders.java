// n^2
// 1
import java.io.*;
import java.util.*;

public class leaders
{
    public static void printLeasers(int arr[], int n)
    {
        for(int i =0; i < n; i++)
        {
            for(int j = i +1; j < size; j++)
            {
                if(arr[i] <= arr[j])
                {
                    break;
                }
            }

            if(j == n)
            {
                System.out.print(arr[i] + " ");
            }
        }
    }

    
}