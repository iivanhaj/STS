import java.util.*;

class nqueens {
    List<List<String>> res = new ArrayList<>();
    
    public List<List<String>> solveNQueens(int n) {
        place(new char[n][n], 0, n);
        return res;
    }
    
    void place(char[][] b, int r, int n) {
        if (r == n) { 
            res.add(format(b)); 
            return; 
        }
        for (int c = 0; c < n; c++) 
            if (isSafe(b, r, c, n)) {
                b[r][c] = 'Q';
                place(b, r + 1, n);
                b[r][c] = '.';
            }
    }
    
    boolean isSafe(char[][] b, int r, int c, int n) {
        for (int i = 0; i < r; i++) 
            if (b[i][c] == 'Q' || c - (r - i) >= 0 && b[i][c - (r - i)] == 'Q' || c + (r - i) < n && b[i][c + (r - i)] == 'Q') 
                return false;
        return true;
    }
    
    List<String> format(char[][] b) {
        List<String> list = new ArrayList<>();
        for (char[] r : b) list.add(new String(r).replace('\0', '.'));
        return list;
    }

    public static void main(String[] args) {
        nqueens queens = new nqueens();
        List<List<String>> res = queens.solveNQueens(5);
        for (List<String> list : res) {
            for (String s : list) System.out.println(s);
            System.out.println();
        }
    }
}
