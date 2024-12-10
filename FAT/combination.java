import java.util.Scanner;

class Solution {
    public int combination(int n, int r) {
        long res = 1;
        for (int i = 0; i < r; i++) 
            res = res * (n - i) / (i + 1);
        return (int) res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n (total items): ");
        int n = sc.nextInt();  // Total number of items
        System.out.print("Enter value of r (items to be selected): ");
        int r = sc.nextInt();  // Number of items to select
        System.out.println("Combination C(n, r) is: " + new Solution().combination(n, r));
    }
}
