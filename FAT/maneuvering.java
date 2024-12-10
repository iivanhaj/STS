import java.util.Scanner;

class Solution {
    public int[] finalPosition(String moves) {
        int x = 0, y = 0;
        for (char move : moves.toCharArray()) 
            if (move == 'U') y++;
            else if (move == 'D') y--;
            else if (move == 'L') x--;
            else if (move == 'R') x++;
        return new int[]{x, y};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter moves string (U, D, L, R): ");
        String moves = sc.nextLine();  // Input moves string
        int[] result = new Solution().finalPosition(moves);
        System.out.println("Final Position: [" + result[0] + ", " + result[1] + "]");
    }
}
