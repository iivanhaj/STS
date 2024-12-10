import java.util.Scanner;

public class Toggle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean[] b = new boolean[n + 1]; // boolean array to store the state of switches
        int c = 0, o = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j += i) {
                b[j] = !b[j]; // toggle the state at position j
            }
        }

        for (int i = 1; i <= n; i++) {
            if (b[i]) {
                c++; // count the number of switches that are "on"
            } else {
                o++; // count the number of switches that are "off"
            }
        }

        // Output the number of switches that are "on" and "off"
        System.out.println(c + " " + o);
    }
}
