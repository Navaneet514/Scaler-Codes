public class Solution {
    public long[] rangeSum(int[] A, int[][] B) {

        long[] pf = new long[A.length];
        long[] sum = new long[B.length];

        pf[0] = A[0];

        for(int i = 1; i <A.length; i++) {
            pf[i] = pf[i-1] + (long)A[i];
        }

        for(int j = 0; j < B.length; j++) {
            int start = B[j][0] - 1;
            int end = B[j][1] - 1;

            if (start == 0) {
                sum[j] = pf[end];
            }
            
            else {
                sum[j] =  pf[end] - pf[start-1];
            }
        }

        return sum;
    }
}
