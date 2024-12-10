import java.util.Scanner;

class Solution {
    public boolean solveMaze(int[][] maze) {
        return dfs(maze, 0, 0);
    }

    private boolean dfs(int[][] maze, int x, int y) {
        if (x == maze.length - 1 && y == maze[0].length - 1) return true;
        if (x < 0 || y < 0 || x >= maze.length || y >= maze[0].length || maze[x][y] == 0) return false;
        maze[x][y] = 0; // Mark visited
        boolean res = dfs(maze, x + 1, y) || dfs(maze, x - 1, y) || dfs(maze, x, y + 1) || dfs(maze, x, y - 1);
        maze[x][y] = 1; // Backtrack
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt(), cols = sc.nextInt();
        int[][] maze = new int[rows][cols];
        for (int i = 0; i < rows; i++) for (int j = 0; j < cols; j++) maze[i][j] = sc.nextInt();
        System.out.println(new Solution().solveMaze(maze) ? "Path exists" : "No path");
    }
}
