public class Solution {
    public int[] solve(int[][] A) {

        int[] colsumarr = new int[A[0].length];

        for(int j = 0; j < A[0].length; j++) {
            int colsum = 0;
            for(int i = 0; i < A.length; i++) {
                colsum += A[i][j];
            }
            colsumarr[j] = colsum;
        }
        return colsumarr;
    }
}
