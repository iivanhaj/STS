import java.util.*;

class Solution {
    public boolean hamiltonianCycle(int[][] g) {
        int[] path = new int[g.length];
        Arrays.fill(path, -1);
        path[0] = 0;
        return backtrack(g, path, 1);
    }

    private boolean backtrack(int[][] g, int[] path, int pos) {
        if (pos == g.length) return g[path[pos - 1]][path[0]] == 1;
        for (int v = 1; v < g.length; v++) {
            if (isSafe(g, path, v, pos)) {
                path[pos] = v;
                if (backtrack(g, path, pos + 1)) return true;
                path[pos] = -1;
            }
        }
        return false;
    }

    private boolean isSafe(int[][] g, int[] path, int v, int pos) {
        if (g[path[pos - 1]][v] == 0) return false;
        for (int i = 0; i < pos; i++) if (path[i] == v) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of vertices: ");
        int n = sc.nextInt();  // number of vertices in the graph
        int[][] graph = new int[n][n];

        System.out.println("Enter the adjacency matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph[i][j] = sc.nextInt();
            }
        }

        Solution solution = new Solution();
        if (solution.hamiltonianCycle(graph)) {
            System.out.println("Hamiltonian cycle exists.");
        } else {
            System.out.println("No Hamiltonian cycle.");
        }
    }
}
