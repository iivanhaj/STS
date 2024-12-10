import java.util.Scanner;

public class MoveHyphens {
    public static String moveHyphens(String s) {
        StringBuilder hyphens = new StringBuilder(), rest = new StringBuilder();
        for (char c : s.toCharArray()) 
            if (c == '-') hyphens.append(c);
            else rest.append(c);
        return hyphens.append(rest).toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.println("Hyphens Moved: " + moveHyphens(s));
    }
}
