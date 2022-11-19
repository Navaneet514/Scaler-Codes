public class Solution {
    public int[][] solve(int[][] A) {

        int n = A.length;
        int m = A[0].length;
        int[][] transpose = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpose[j][i] = A[i][j];
            }
        } 
        return transpose;
    }
}
