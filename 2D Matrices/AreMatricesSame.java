public class Solution {
    public int solve(int[][] A, int[][] B) {

        int cnt = 0;
        int items = A.length * A[0].length;

        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < A[0].length; j++) {
                if (A[i][j] == B[i][j]) {
                    cnt++;
                }
            }
        }

        if (cnt == items) {
            return 1;
        }
        return 0;
    }
}
