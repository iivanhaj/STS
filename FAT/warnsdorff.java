class Solution {
    int[] xMoves = {2, 1, -1, -2, -2, -1, 1, 2}, yMoves = {1, 2, 2, 1, -1, -2, -2, -1};
    
    public boolean knightTour(int n) {
        int[][] board = new int[n][n];
        for (int[] row : board) Arrays.fill(row, -1);
        board[0][0] = 0; 
        return solve(board, 0, 0, 1, n);
    }

    private boolean solve(int[][] board, int x, int y, int move, int n) {
        if (move == n * n) return true;
        for (int i = 0; i < 8; i++) {
            int nx = x + xMoves[i], ny = y + yMoves[i];
            if (nx >= 0 && ny >= 0 && nx < n && ny < n && board[nx][ny] == -1) {
                board[nx][ny] = move;
                if (solve(board, nx, ny, move + 1, n)) return true;
                board[nx][ny] = -1;
            }
        }
        return false;
    }
}
