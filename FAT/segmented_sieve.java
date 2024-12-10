public class Segmented {
    public static void SegSieve(int l, int h) {
        // Step 1: Create a boolean array to mark primes in the range
        boolean prime[] = new boolean[h - l + 1];

        // Step 2: Mark the non-prime numbers
        for (int p = 2; p * p <= h; p++) {
            // Find the minimum number in the [l, h] range that is a multiple of p
            int sm = Math.max(p * p, (l + p - 1) / p * p);

            // Mark all multiples of p as non-prime
            for (int i = sm; i <= h; i += p) {
                prime[i - l] = true;
            }
        }

        // Step 3: Print all primes in the range
        for (int i = l; i <= h; i++) {
            if (!prime[i - l] && i > 1) { // Ensure not marking 1 as prime
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        SegSieve(10, 30);
    }
}
