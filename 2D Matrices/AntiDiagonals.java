public class Solution {
    public int[][] diagonal(int[][] A) {

        int n = A.length;
        int m = A[0].length;
        int ans[][] = new int[2*n - 1][m];
        for(int i = 0; i < m; i++){
            int r = 0, c = i, j = 0;
            while(r < n && c >=0){
                ans[i][j] = A[r][c];
                r++; j++; c--;
            }
        }
        for(int i = 1; i < n; i++){
            int r = i, c = m-1, j = 0;
            while(r < n && c >=0){
                ans[i+n-1][j] = A[r][c];
                j++; r++; c--;
            }
        }
        return ans;
    }
}
