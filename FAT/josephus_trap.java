import java.util.Scanner;

class Solution {
    public int josephus(int n, int k) {
        return n == 1 ? 0 : (josephus(n - 1, k) + k) % n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Number of people
        int k = sc.nextInt();  // Step size
        System.out.println(new Solution().josephus(n, k) + 1); // 1-based index
    }
}
