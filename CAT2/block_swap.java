// n 
// space: 1
// space: log n

import java.util.*;
import java.io.*;

public class main{
    public static void leftrotate(int arr[], int d, int n)
    {
        int i,j;
        if(d == 0 || d == n)
        {
            return;
        }

        if(d > n)
        {
            d = d % n;
        }

         i = d;
         j = n - d;

         while(i!=j)
         {
            if(i < j)
            {
                swap(arr, d - i, d + j - i, i);
                j -= i;
            }
            else
            {
                swap(arr, d-i, d , j);
                i -= j;
            }
         }
         swap(arr,d-i,d,i);
    }

    public static void printArray(int arr[], int size)
    {
        for(int i = 0; i < size; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void swap(int arr[], int fi, int si, int d)
    {
        int i, temp;
        for(i = 0; i < d; i++)
        {
            temp = arr[fi + i];
            arr[fi + i] = arr[si + i];
            arr[si + i] = temp;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        leftrotate(arr, d, n);
        printArray(arr, n);
    }
}