import java.util.Scanner;

public class UniquePermutation {
    public static void printPermutations(String s, String ans) {
        if (s.isEmpty()) {
            System.out.println(ans);
            return;
        }
        boolean[] used = new boolean[256];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!used[ch]) {
                used[ch] = true;
                printPermutations(s.substring(0, i) + s.substring(i + 1), ans + ch);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        Arrays.sort(chars); // To ensure sorted order
        printPermutations(new String(chars), "");
    }
}
