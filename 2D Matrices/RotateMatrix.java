public class Solution {

    public int[][] solve(int[][] A) {
        // Transpose
        int n = A.length;
        for(int i = 0;i < n; i++) {
            for(int j = i; j < n; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        // Reverse Each Row
        
        for(int i = 0; i < A.length; i++) {
            int k = n - 1, j = 0;
            while(j < k) {
                int tmp = A[i][j];
                A[i][j] = A[i][k];
                A[i][k] = tmp;
                k--;
                j++;
            }
        }
        return A;
    }
}
