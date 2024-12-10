// n
// 1

import java.util.*;
import java.io.*;

import java.util.Scanner;

public class max_eq_sum {
    public static int getMaxEquilibriumSumOptimized(int[] arr) {
        int totalSum = 0;
        int prefixSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i];

            if (prefixSum == totalSum && prefixSum > maxSum) {
                maxSum = prefixSum;
            }

            prefixSum += arr[i];
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxSum = getMaxEquilibriumSumOptimized(arr);

        if (maxSum == Integer.MIN_VALUE) {
            System.out.println("None");
        } else {
            System.out.println("Max Equilibrium Sum: " + maxSum);
        }

        sc.close();
    }
}
