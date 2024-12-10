public class WeightedSubstring {
    public static int weightedSubstring(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) sum += c; // ASCII of character
        return sum;
    }

    public static void main(String[] args) {
        String s = "abc"; // ASCII: 97 + 98 + 99 = 294
        System.out.println("Weighted Substring: " + weightedSubstring(s));
    }
}
